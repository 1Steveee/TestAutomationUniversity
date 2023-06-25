package chapter10;

public class Apple extends Fruit {
    private String color;

    public Apple(int calories) {
        super(calories);
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eatApple() {
        System.out.println("I ate the apple");
    }

    @Override
    public void makeJuice() {
        System.out.println("Wow this juice is tasty");
    }
}
