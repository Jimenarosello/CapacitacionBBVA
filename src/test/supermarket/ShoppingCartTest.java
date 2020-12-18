package test.supermarket;

import main.supermarket.Product;
import main.supermarket.ShoppingCart;
import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTest {

    @Test
    public void whenGetPrice_thenReturnCorrectPrice() {
        Product queso = new Product(200, "Queso");
        Product jamon = new Product(150, "Jamon");
        Product galletitas = new Product (100, "Galletitas");

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(queso);
        shoppingCart.addProduct(jamon);
        shoppingCart.addProduct(galletitas);

        Assert.assertEquals(450, shoppingCart.payCart());
    }
}
