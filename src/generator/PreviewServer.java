package generator;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

/**
 * Serves the generated site and handles the forms inside it.
 *
 * The generated pages are static, so their forms have nowhere to post to. This
 * server closes that gap without a second framework: it hands out the files the
 * compiler produced, and when a form is submitted it changes the data and asks
 * the compiler to regenerate before redirecting back. What the browser shows is
 * always the compiler's own output.
 *
 * Only the JDK is used; com.sun.net.httpserver ships with it.
 */
public class PreviewServer {

    /** What the driver must provide: how to change the data and rebuild. */
    public interface Actions {

        /** Adds one record from the submitted form fields. */
        void add(Map<String, String> fields) throws Exception;

        /** Removes the record carrying this id. */
        void delete(String id) throws Exception;

        /** Regenerates the whole site after a change. */
        void rebuild(String reason) throws Exception;

        /** The generated file that answers a URL, e.g. "/" -> products.html. */
        String fileFor(String url);

        /** Where an uploaded image is stored so the next build copies it. */
        Path imageFolder();

        /** The path an uploaded image gets inside the generated pages. */
        String imageLink(String fileName);
    }

    private static final Map<String, String> CONTENT_TYPES = Map.of(
            ".html", "text/html; charset=utf-8",
            ".css", "text/css; charset=utf-8",
            ".js", "application/javascript; charset=utf-8",
            ".json", "application/json; charset=utf-8",
            ".txt", "text/plain; charset=utf-8",
            ".jpg", "image/jpeg",
            ".jpeg", "image/jpeg",
            ".png", "image/png",
            ".svg", "image/svg+xml",
            ".ico", "image/x-icon");

    private final Path root;
    private final Actions actions;
    private final int port;

    public PreviewServer(Path root, int port, Actions actions) {
        // Absolute from the start: the containment check below compares against
        // it, and a relative path would never match.
        this.root = root.toAbsolutePath().normalize();
        this.port = port;
        this.actions = actions;
    }

    /** Starts serving and returns; the JVM stays alive on the server's threads. */
    public void start() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/", this::handle);
        server.setExecutor(null);
        server.start();
        System.out.println("   serving " + root.toAbsolutePath() + " on http://localhost:" + port);
    }

    /** Routes one request: a form post changes data, anything else serves a file. */
    private void handle(HttpExchange exchange) throws IOException {
        String path = exchange.getRequestURI().getPath();
        try {
            if (exchange.getRequestMethod().equalsIgnoreCase("POST")) {
                handlePost(exchange, path);
            } else {
                serveFile(exchange, path);
            }
        } catch (Exception failure) {
            respond(exchange, 500, "text/plain; charset=utf-8",
                    ("request failed: " + failure).getBytes(StandardCharsets.UTF_8));
        } finally {
            exchange.close();
        }
    }

    // ============================================================
    // Form submissions
    // ============================================================

    /** Applies an add or a delete, rebuilds, then sends the browser back. */
    private void handlePost(HttpExchange exchange, String path) throws Exception {
        byte[] body = exchange.getRequestBody().readAllBytes();
        String contentType = header(exchange, "Content-Type");

        if (path.startsWith("/delete-product/")) {
            String id = path.substring("/delete-product/".length());
            actions.delete(id);
            actions.rebuild("deleted product " + id);
            redirect(exchange, "/" + actions.fileFor("/"));
            return;
        }

        if (path.equals("/add-product")) {
            Map<String, String> fields = readFields(body, contentType);
            actions.add(fields);
            actions.rebuild("added product " + fields.getOrDefault("name", ""));
            redirect(exchange, "/" + actions.fileFor("/"));
            return;
        }

        respond(exchange, 404, "text/plain; charset=utf-8",
                ("no handler for POST " + path).getBytes(StandardCharsets.UTF_8));
    }

    /**
     * Reads the submitted fields from either encoding a browser may use.
     * An uploaded file is written into the source assets folder, so the next
     * build carries it into the output like any other companion file.
     */
    private Map<String, String> readFields(byte[] body, String contentType) throws IOException {
        Map<String, String> fields = new LinkedHashMap<>();
        if (contentType != null && contentType.startsWith("multipart/form-data")) {
            for (Part part : parseMultipart(body, boundaryOf(contentType))) {
                if (part.fileName == null) {
                    fields.put(part.name, new String(part.data, StandardCharsets.UTF_8).trim());
                } else if (part.data.length > 0) {
                    fields.put(part.name, storeUpload(part));
                }
            }
            return fields;
        }
        for (String pair : new String(body, StandardCharsets.UTF_8).split("&")) {
            int equals = pair.indexOf('=');
            if (equals > 0) {
                fields.put(decode(pair.substring(0, equals)), decode(pair.substring(equals + 1)));
            }
        }
        return fields;
    }

    /** Saves an uploaded image beside the other assets and returns its link. */
    private String storeUpload(Part part) throws IOException {
        String fileName = part.fileName.replaceAll("[^A-Za-z0-9._-]", "_");
        Path folder = actions.imageFolder();
        Files.createDirectories(folder);
        Files.write(folder.resolve(fileName), part.data);
        return actions.imageLink(fileName);
    }

    // ============================================================
    // Static files
    // ============================================================

    /** Sends one generated file, mapping "/" onto the site's entry page. */
    private void serveFile(HttpExchange exchange, String path) throws IOException {
        String relative = path.equals("/") ? actions.fileFor("/") : path.substring(1);
        Path file = root.resolve(relative).normalize();

        // Never serve anything outside the output folder.
        if (!file.startsWith(root) || !Files.isRegularFile(file)) {
            respond(exchange, 404, "text/plain; charset=utf-8",
                    ("not found: " + relative).getBytes(StandardCharsets.UTF_8));
            return;
        }
        respond(exchange, 200, contentTypeOf(relative), Files.readAllBytes(file));
    }

    private static String contentTypeOf(String name) {
        int dot = name.lastIndexOf('.');
        String suffix = dot < 0 ? "" : name.substring(dot).toLowerCase();
        return CONTENT_TYPES.getOrDefault(suffix, "application/octet-stream");
    }

    // ============================================================
    // Plumbing
    // ============================================================

    private void redirect(HttpExchange exchange, String location) throws IOException {
        exchange.getResponseHeaders().add("Location", location);
        // 303 makes the browser follow with GET, so a refresh will not re-post.
        exchange.sendResponseHeaders(303, -1);
    }

    private void respond(HttpExchange exchange, int status, String type, byte[] body)
            throws IOException {
        exchange.getResponseHeaders().add("Content-Type", type);
        exchange.getResponseHeaders().add("Cache-Control", "no-store");
        exchange.sendResponseHeaders(status, body.length);
        try (OutputStream out = exchange.getResponseBody()) {
            out.write(body);
        }
    }

    private static String header(HttpExchange exchange, String name) {
        List<String> values = exchange.getRequestHeaders().get(name);
        return values == null || values.isEmpty() ? null : values.get(0);
    }

    private static String decode(String text) {
        return java.net.URLDecoder.decode(text, StandardCharsets.UTF_8);
    }

    // ============================================================
    // multipart/form-data
    // ============================================================

    /** One submitted field; fileName is null for a plain text field. */
    private record Part(String name, String fileName, byte[] data) {}

    private static String boundaryOf(String contentType) {
        for (String piece : contentType.split(";")) {
            String trimmed = piece.trim();
            if (trimmed.startsWith("boundary=")) {
                return trimmed.substring("boundary=".length()).replace("\"", "");
            }
        }
        return "";
    }

    /**
     * Splits a multipart body into its parts.
     * The work is done on bytes, not text, so an uploaded image survives intact.
     */
    private static List<Part> parseMultipart(byte[] body, String boundary) {
        List<Part> parts = new ArrayList<>();
        byte[] delimiter = ("--" + boundary).getBytes(StandardCharsets.UTF_8);
        byte[] blankLine = "\r\n\r\n".getBytes(StandardCharsets.UTF_8);

        int start = indexOf(body, delimiter, 0);
        while (start >= 0) {
            int from = start + delimiter.length;
            int next = indexOf(body, delimiter, from);
            if (next < 0) {
                break;                                  // the closing --boundary--
            }
            int headerEnd = indexOf(body, blankLine, from);
            if (headerEnd < 0 || headerEnd > next) {
                start = next;
                continue;
            }
            String headers = new String(body, from, headerEnd - from, StandardCharsets.UTF_8);
            int dataStart = headerEnd + blankLine.length;
            int dataEnd = next - 2;                     // drop the CRLF before the delimiter

            if (dataEnd > dataStart) {
                byte[] data = new byte[dataEnd - dataStart];
                System.arraycopy(body, dataStart, data, 0, data.length);
                parts.add(new Part(attribute(headers, "name"), attribute(headers, "filename"), data));
            } else {
                parts.add(new Part(attribute(headers, "name"), attribute(headers, "filename"), new byte[0]));
            }
            start = next;
        }
        return parts;
    }

    /** Reads name="value" out of a Content-Disposition header. */
    private static String attribute(String headers, String key) {
        int at = headers.indexOf(key + "=\"");
        if (at < 0) {
            return null;
        }
        int from = at + key.length() + 2;
        int to = headers.indexOf('"', from);
        return to < 0 ? null : headers.substring(from, to);
    }

    /** First position of a byte pattern at or after {@code from}, or -1. */
    private static int indexOf(byte[] data, byte[] pattern, int from) {
        outer:
        for (int i = from; i <= data.length - pattern.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (data[i + j] != pattern[j]) {
                    continue outer;
                }
            }
            return i;
        }
        return -1;
    }
}
