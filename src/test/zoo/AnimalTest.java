package test.zoo;

import main.zoo.Canary;
import main.zoo.Cow;
import main.zoo.Dog;
import main.zoo.Penguin;
import main.zoo.Platypus;

public class AnimalTest {

    public static void main(String[] args) {

        Cow cora = new Cow();
        Canary tweety = new Canary();
        Dog tom = new Dog();
        Platypus perry = new Platypus();
        Penguin cabo = new Penguin();

        System.out.println("Estoy hablando con la vaca");
        cora.produceSound();
        cora.eat();
        cora.breastFeed();

        System.out.println("Estoy hablando con el canario");
        tweety.produceSound();
        tweety.eat();
        tweety.fly();

        System.out.println("Estoy hablando con el perro");
        tom.produceSound();
        tom.eat();
        tom.breastFeed();

        System.out.println("Estoy hablando con el ornitorrinco");
        perry.produceSound();
        perry.eat();
        perry.breastFeed();

        System.out.println("Estoy hablando con el pinguino");
        cabo.produceSound();
        cabo.eat();
        cabo.fly();

    }

}
