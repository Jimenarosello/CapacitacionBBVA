package main.exception;

public class AgeMismatchException extends Exception {

    public AgeMismatchException() {
        super("La edad no matchea con el año de nacimiento");
    }

}
