package test.zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import main.zoo.Animal;
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

        System.out.println();
        System.out.println("Ejercicio de mapas");

        Map<String, Animal> map = new HashMap<>();
        map.put("vaca", cora);
        map.put("perro", tom);
        map.put("ornitorrinco", perry);

        map.get("vaca").produceSound();
        map.get("perro").produceSound();
        map.get("ornitorrinco").produceSound();


        System.out.println(map.keySet()
                .stream()
                .filter(animal -> animal.contains("rr"))
                .collect(Collectors.toList()));

        List<String> keysContainingRR = new ArrayList<>();
        for (String key: map.keySet()) {
            if (key.contains("rr")) {
                keysContainingRR.add(key);
            }
        }
        System.out.println(keysContainingRR);

    }

}
