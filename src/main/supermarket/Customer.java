package main.supermarket;

public class Customer {

    private ShoppingCart shoppingCart;
    private int availableMoney;

    public Customer(ShoppingCart shoppingCart, int availableMoney) {
        this.shoppingCart = shoppingCart;
        this.availableMoney = availableMoney;
    }

    public void buyCart() {
        int price = this.shoppingCart.payCart();
        if (price > availableMoney) {
            throw new NotEnoughMoneyException();
        }
        this.availableMoney -= price;
    }

    public int getRemainingMoney() {
        return this.availableMoney;
    }
}
