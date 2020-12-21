package main.supermarket;

public class NegativePriceException extends RuntimeException {

    public NegativePriceException() {
        super("El precio debe ser mayor a cero");
    }

}
