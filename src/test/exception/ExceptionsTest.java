package test.exception;

import main.exception.AgeMismatchException;
import main.exception.InvalidAgeException;
import main.exception.InvalidNameException;
import main.exception.Person;

public class ExceptionsTest {

    public static void main(String[] args) {

        try {
            Person person = new Person("Pepito", 20, 2000);
            System.out.println("Soy " + person.getName());
        } catch (InvalidNameException | InvalidAgeException | AgeMismatchException exception) {
            System.out.println(exception.getMessage());
        }
    }

}
