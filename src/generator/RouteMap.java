package generator;

import java.util.ArrayList;
import java.util.List;

public class RouteMap {

    // One Flask route, the file generated for it, and its URL parameters. 
    private record Rule(String pattern, String file, List<String> parameters) {}

    private final List<Rule> rules = new ArrayList<>();
    private boolean serverMode;

    /**
     * When the preview server is running, a form keeps posting to its route,
     * because there is now something listening for it on the same origin.
     */
    public void setServerMode(boolean on) {
        this.serverMode = on;
    }

    /** Registers the file that a route pattern is generated into. */
    public void register(String pattern, String file) {
        if (pattern != null && file != null) {
            rules.add(new Rule(pattern, file, parametersOf(pattern)));
        }
    }

    /** href="/product/3" becomes "product_details.html?product_id=3". */
    public String rewriteNavigation(String url) {
        if (isExternal(url)) {
            return url;
        }
        for (Rule rule : rules) {
            List<String> values = match(rule, url);
            if (values == null) {
                continue;
            }
            if (rule.parameters().isEmpty()) {
                return rule.file();
            }
            StringBuilder link = new StringBuilder(rule.file());
            for (int i = 0; i < rule.parameters().size() && i < values.size(); i++) {
                link.append(i == 0 ? '?' : '&')
                    .append(rule.parameters().get(i)).append('=').append(values.get(i));
            }
            return link.toString();
        }
        return url;                              // an unknown route, left as-is
    }

    /**
     * A POST needs something listening. Without the preview server there is
     * nothing, so the form is disabled; with it, the route is kept as written.
     */
    public String rewriteSubmission(String url) {
        if (isExternal(url)) {
            return url;
        }
        return serverMode ? url : "#";
    }

    /** True when the URL is not a Flask route and must be left untouched. */
    private boolean isExternal(String url) {
        return url == null || url.isEmpty()
                || url.startsWith("http")
                || url.startsWith("#")
                || !url.startsWith("/");
    }

    /**
     * Matches a URL against one rule, returning the parameter values it carries,
     * or null when the rule does not apply.
     */
    private List<String> match(Rule rule, String url) {
        String[] patternParts = rule.pattern().split("/");
        String[] urlParts = url.split("/");
        if (patternParts.length != urlParts.length) {
            return null;
        }
        List<String> values = new ArrayList<>();
        for (int i = 0; i < patternParts.length; i++) {
            String part = patternParts[i];
            if (part.startsWith("<") && part.endsWith(">")) {
                values.add(urlParts[i]);
            } else if (!part.equals(urlParts[i])) {
                return null;
            }
        }
        return values;
    }

    /** Extracts /product/&lt;int:product_id&gt; into [product_id]. */
    private static List<String> parametersOf(String pattern) {
        List<String> names = new ArrayList<>();
        int i = 0;
        while (true) {
            int open = pattern.indexOf('<', i);
            if (open < 0) {
                return names;
            }
            int close = pattern.indexOf('>', open);
            if (close < 0) {
                return names;
            }
            String token = pattern.substring(open + 1, close);
            int colon = token.indexOf(':');                  // drop the converter
            names.add(colon >= 0 ? token.substring(colon + 1) : token);
            i = close + 1;
        }
    }
}
