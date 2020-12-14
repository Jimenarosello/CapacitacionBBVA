package main.exception;

import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private int birthYear;

    public Person(String name, int age, int birthYear) throws InvalidNameException,
            InvalidAgeException, AgeMismatchException {
        setName(name);
        setAge(age, birthYear);
    }

    public void setName(String name) throws InvalidNameException {
        if (name.equals("")) {
            throw new InvalidNameException();
        }
        this.name = name;
    }

    public void setAge(int age, int birthYear) throws InvalidAgeException, AgeMismatchException {
        if (isInvalidAge(age)) {
            throw new InvalidAgeException();
        }
        if (isAgeMismatch(age, birthYear)) {
            throw new AgeMismatchException();
        }
        this.age = age;
        this.birthYear = birthYear;
    }

    public String getName() {
        return this.name;
    }

    private boolean isInvalidAge(int age) {
        return age < 0 || age > 150;
    }

    private boolean isAgeMismatch(int age, int birthYear) {
        return LocalDate.now().getYear() - birthYear != age;
    }

}
