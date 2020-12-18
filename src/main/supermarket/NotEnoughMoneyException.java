package main.supermarket;

public class NotEnoughMoneyException extends RuntimeException {

    public NotEnoughMoneyException() {
        super("El cliente no tiene suficiente dinero para realizar esta compra.");
    }

}
