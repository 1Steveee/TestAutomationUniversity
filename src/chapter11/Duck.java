package chapter11;

public class Duck extends Animal {
    @Override
    void makeSound() {
        System.out.println("Quack quack quack");
    }

    @Override
    public void eat() {
        System.out.println("I am not hungry");
    }
}
