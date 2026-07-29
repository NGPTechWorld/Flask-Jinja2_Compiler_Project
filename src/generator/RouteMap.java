package generator;

public class RouteMap {

    public String rewrite(String url) {
        if (url == null || url.isEmpty()
                || url.startsWith("http") || url.startsWith("#")
                || url.startsWith("static/")) {
            return url;
        }
        if (url.equals("/"))                  return "products.html";
        if (url.equals("/add-product"))       return "add_product.html";
        if (url.matches("/product/\\d+"))     return "product_" + url.substring(9) + ".html";

        // A POST route cannot be honoured without a server.
        if (url.startsWith("/delete-product/")) return "#";
        return url;
    }
}
