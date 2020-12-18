package main.supermarket;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public int payCart() {
        /*int price = 0;
        for (Product product: products) {
            price += product.getPrice();
        }
        return price; */

        return products
                .stream()
                .mapToInt(product -> product.getPrice())
                .sum();
    }

}
