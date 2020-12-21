package main.zoo;

public abstract class Animal implements ProduceSound {

    public void sleep() {
        System.out.println("zzzz");
    }

    public abstract void eat();

}
