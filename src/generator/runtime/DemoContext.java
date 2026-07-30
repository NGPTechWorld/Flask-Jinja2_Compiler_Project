package generator.runtime;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DemoContext {

        /** Mirrors: render_template('products.html', products=products) */
        public static Scope forProducts() {
                List<Object> products = new ArrayList<>();
                products.add(product(1, "Dell XPS 15 Laptop", 450,
                                "static/images/image1.jpg",
                                "High-performance laptop with a crystal-clear display."));
                products.add(product(2, "iPhone 15 Pro", 520,
                                "static/images/image2.jpg",
                                "The latest Apple phone with a professional camera."));
                products.add(product(3, "Sony WH-1000XM5 Headphones", 120,
                                "static/images/image3.jpg",
                                "Wireless headphones with exceptional noise cancellation."));

                Scope scope = new Scope();
                scope.set("products", products);
                return scope;
        }

        /** One Python dict. */
        private static Map<String, Object> product(int id, String name, int price,
                        String image, String description) {
                Map<String, Object> p = new LinkedHashMap<>();
                p.put("id", id);
                p.put("name", name);
                p.put("price", price);
                p.put("image", image);
                p.put("description", description);
                return p;
        }

        /** Mirrors: render_template('product_details.html', product=product) */
        public static Scope forProductDetails() {
                Scope scope = new Scope();
                scope.set("product", product(1, "Dell XPS 15 Laptop", 450,
                                "static/images/image1.jpg",
                                "High-performance laptop with a crystal-clear display."));
                return scope;
        }

        /** Mirrors: render_template('add_product.html') — no context at all. */
        public static Scope empty() {
                return new Scope();
        }

}
