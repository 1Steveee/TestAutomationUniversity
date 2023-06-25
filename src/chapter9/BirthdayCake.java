package chapter9;

public class BirthdayCake extends Cake {

    private int candles;

    public BirthdayCake(String flavor, double price) {
        super(flavor, price);
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
