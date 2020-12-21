package test.generics;

import java.util.LinkedList;
import java.util.List;
import main.zoo.Cow;
import main.zoo.Dog;
import main.generics.ClassWithGeneric;

public class ClaseConGenericoTest {

    public static void main(String[] args) {

        ClassWithGeneric genericCow = new ClassWithGeneric(new Cow());
        genericCow.genericProduceSound();
        genericCow.showType();

        ClassWithGeneric genericDog = new ClassWithGeneric(new Dog());
        genericDog.genericProduceSound();
        genericDog.showType();

        List<String> list = new LinkedList<>();

    }
}
