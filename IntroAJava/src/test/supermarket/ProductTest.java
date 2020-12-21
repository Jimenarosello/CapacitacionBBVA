package test.supermarket;

import main.exception.InvalidNameException;
import main.supermarket.NegativePriceException;
import main.supermarket.Product;
import org.junit.Assert;
import org.junit.Test;

public class ProductTest {

    @Test
    public void whenNameAndPriceAreValid_thenCreateProduct() {
        Product product = new Product(200, "Queso");
        Assert.assertEquals("Queso", product.getName());
        Assert.assertEquals(200, product.getPrice());
    }

    @Test(expected = InvalidNameException.class)
    public void whenNameIsInvalid_thenThrowException() {
        new Product(200, "");
    }

    @Test(expected = NegativePriceException.class)
    public void whenPriceIsNegative_thenThrowException() {
        new Product(-5, "Queso");
    }

    @Test(expected = NegativePriceException.class)
    public void whenPriceIsZero_thenThrowException() {
        new Product(0, "Queso");
    }

}
