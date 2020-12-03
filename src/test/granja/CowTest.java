package test.granja;

import main.granja.Cow;

public class CowTest {
    public static void main(String[] args) {
        Cow cow1 = new Cow("Cora", 4, 720);
        Cow cow2 = new Cow("Betsie", 2, 500);

        System.out.println(cow1.weigh());
        System.out.println(cow1.eat());
        System.out.println(cow1.callByName("Cora"));
        System.out.println(cow1.callByName("Betsie"));
        System.out.println(cow2.weigh());
        System.out.println(cow2.eat());
        System.out.println(cow2.callByName("Cora"));
        System.out.println(cow2.callByName("Betsie"));
    }
}
