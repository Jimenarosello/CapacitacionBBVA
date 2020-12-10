package main.zoo;

public class Penguin extends Bird {

    @Override
    public void eat() {
        System.out.println("Estoy comiendo pescado");
    }

    @Override
    public void produceSound() {
        System.out.println("Estoy hablando");
    }

    @Override
    public void fly() {
        System.out.println("No puedo volar :(");
    }
}
