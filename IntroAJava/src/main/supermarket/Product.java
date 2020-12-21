package main.supermarket;

import main.exception.InvalidNameException;

public class Product {

    private int price;
    private String name;

    public Product(int price, String name) {
        setPrice(price);
        setName(name);
    }

    public void setPrice(int price) {
        if (price <= 0) {
            throw new NegativePriceException();
        }
        this.price = price;
    }

    public void setName(String name) {
        if (name.equals("")) {
            throw new InvalidNameException();
        }
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

}
