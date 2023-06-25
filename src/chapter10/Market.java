package chapter10;

public class Market {
    public static void main(String[] args) {
        Apple apple = new Apple(50);
        apple.makeJuice();
        apple.eatApple();

        Banana banana = new Banana(100);
        banana.peelBanana();
        banana.makeJuice();

        throwAwayFruit(banana);
        throwAwayFruit(apple);

        Fruit greenApple = new Apple(90);
        ((Apple) greenApple).eatApple();
    }

    public static void throwAwayFruit(Fruit fruit) {
        System.out.println("The fruit was disposed");
    }
}
