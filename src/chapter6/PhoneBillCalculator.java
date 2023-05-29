package chapter6;

public class PhoneBillCalculator {

    public static void main(String[] args) {
        PhoneBill phoneBill = new PhoneBill(5);
        phoneBill.setAllottedMinutes(800);
        phoneBill.printBill();
    }
}
