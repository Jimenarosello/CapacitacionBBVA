package main.zoo;

public class Dog extends Mammal {

    private String name;

    /*public Dog(String name) {
        this.name = name;
    }*/

    @Override
    public void produceSound() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("Estoy comiendo alimento balanceado");
    }
}
