package chapter11;

public class Farm {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.eat();
        duck.makeSound();

        Pig pig = new Pig();
        pig.eat();
        pig.makeSound();
    }
}
