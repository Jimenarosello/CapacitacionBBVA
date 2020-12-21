package main.generics;

import main.zoo.Animal;

public class ClassWithGeneric<T extends Animal> {

    private Animal objeto;

    public ClassWithGeneric(T objeto) {
        this.objeto = objeto;
    }

    public void genericProduceSound() {
        objeto.produceSound();
    }

    public void showType() {
        System.out.println("El tipo T es: " + objeto.getClass().getName());
    }
}
