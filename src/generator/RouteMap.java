package generator;

/**
 * Flask routes are server endpoints; a static build has no server.
 *
 * Navigation (an href, a GET) is rewritten to the file the generator actually
 * produces, so links keep working when the output is opened directly.
 * Submission (a form action, a POST) has no static equivalent and is disabled.
 */
public class RouteMap {

    /** The single source of truth for a product page's file name. */
    public static String detailsPage(Object id) {
        return "product_" + id + ".html";
    }

    /** True when the URL is not a Flask route and must be left untouched. */
    private boolean isExternal(String url) {
        return url == null || url.isEmpty()
                || url.startsWith("http")
                || url.startsWith("#")
                || !url.startsWith("/");
    }

    /** href="/product/3" becomes "product_3.html". */
    public String rewriteNavigation(String url) {
        if (isExternal(url)) {
            return url;
        }
        if (url.equals("/")) {
            return "products.html";
        }
        if (url.equals("/add-product")) {
            return "add_product.html";
        }
        if (url.matches("/product/\\d+")) {
            return detailsPage(url.substring("/product/".length()));
        }
        return url;
    }

    /** action="/delete-product/3" becomes "#": a POST needs a running server. */
    public String rewriteSubmission(String url) {
        return isExternal(url) ? url : "#";
    }
}
