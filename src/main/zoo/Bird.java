package main.zoo;

public abstract class Bird extends Animal implements LaysEggs {

    public void fly() {
        System.out.println("Estoy volando");
    }

    @Override
    public void layEgg() {
        System.out.println("Puse un huevo");
    }

}
