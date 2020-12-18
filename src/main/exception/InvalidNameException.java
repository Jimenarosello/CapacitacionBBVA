package main.exception;

public class InvalidNameException extends RuntimeException {

    public InvalidNameException() {
        super("El nombre es inválido");
    }

}
