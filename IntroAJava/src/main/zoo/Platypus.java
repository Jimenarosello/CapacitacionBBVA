package main.zoo;

public class Platypus extends Mammal implements LaysEggs {

    @Override
    public void eat() {
        System.out.println("Estoy comiendo");
    }

    @Override
    public void produceSound() {
        System.out.println("Grrrr");
    }

    @Override
    public void layEgg() {
        System.out.println("Soy el único mamífero que pone huevos");
    }
}
