package main.exception;

public class InvalidNameException extends Exception {

    public InvalidNameException() {
        super("El nombre es inválido");
    }

}
