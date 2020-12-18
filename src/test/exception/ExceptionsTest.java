package test.exception;

import main.exception.AgeMismatchException;
import main.exception.InvalidAgeException;
import main.exception.InvalidNameException;
import main.exception.Person;
import org.junit.Assert;
import org.junit.Test;

public class ExceptionsTest {

    @Test
    public void whenNameAndAgeAreOK_thenCreatePerson()
            throws InvalidAgeException, InvalidNameException, AgeMismatchException {
        Person person = new Person("Pepito", 20, 2000);
        Assert.assertEquals("Pepito", person.getName());
    }

    @Test(expected = InvalidNameException.class)
    public void whenNameIsEmpty_thenThrowException()
            throws InvalidAgeException, InvalidNameException, AgeMismatchException {
        new Person("", 20, 2000);
    }

    @Test(expected = InvalidAgeException.class)
    public void whenAgeIsInvalid_thenThrowException()
            throws InvalidAgeException, InvalidNameException, AgeMismatchException {
        new Person("Pepito", -5, 2000);
    }

    @Test(expected = AgeMismatchException.class)
    public void whenAgeDoesntMachYear_thenThrowException()
            throws InvalidAgeException, InvalidNameException, AgeMismatchException {
        new Person("Pepito", 20, 2010);
    }

}
