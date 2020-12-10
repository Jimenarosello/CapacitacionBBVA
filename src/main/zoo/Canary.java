package main.zoo;

public class Canary extends Bird {

    @Override
    public void eat() {
        System.out.println("Estoy comiendo semillitas");
    }

    @Override
    public void produceSound() {
        System.out.println("Pi pi pi");
    }

}
