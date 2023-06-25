package chapter10;

public class Banana extends Fruit {
    private boolean isPeeled = false;

    public Banana(int calories) {
        super(calories);
    }

    public boolean isPeeled() {
        return isPeeled;
    }

    public void setPeeled(boolean peeled) {
        isPeeled = peeled;
    }

    public void peelBanana() {
        System.out.println("Banana is peeled");
    }
    public void makeJuice() {
        System.out.println("Banana juice is the best");
    }


}
