package main.exception;

public class InvalidAgeException extends Exception {

    public InvalidAgeException() {
        super("La edad es inválida");
    }

}
