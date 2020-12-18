package test.supermarket;

import main.supermarket.Customer;
import main.supermarket.NotEnoughMoneyException;
import main.supermarket.Product;
import main.supermarket.ShoppingCart;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void whenCustomerHasEnoughMoney_thenUpdateAvailableMoney() {
        Customer customer = new Customer(createShoppingCart(), 500);

        customer.buyCart();
        Assert.assertEquals(50, customer.getRemainingMoney());
    }

    @Test(expected = NotEnoughMoneyException.class)
    public void whenCustomerDoesntHaveEnoughMoney_thenThrowException() {
        Customer customer = new Customer(createShoppingCart(), 300);

        customer.buyCart();
    }

    private ShoppingCart createShoppingCart() {
        Product queso = new Product(200, "Queso");
        Product jamon = new Product(150, "Jamon");
        Product galletitas = new Product (100, "Galletitas");

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(queso);
        shoppingCart.addProduct(jamon);
        shoppingCart.addProduct(galletitas);

        return shoppingCart;
    }

}
