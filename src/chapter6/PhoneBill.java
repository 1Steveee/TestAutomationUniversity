package chapter6;

public class PhoneBill {

    private int id;
    private double baseCost;
    private double allottedMinutes;
    private double minutesUsed;

    public PhoneBill() {
        id = 0;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBill(int id) {
        this.id = id;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBill(int id, double baseCost, double allottedMinutes, double minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public double getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(double allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public double getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(double minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    private double calculateOverageAmount() {
        double overageFee = .25;

        if (this.getMinutesUsed() <= this.getAllottedMinutes())
            return 0;

        return (this.getAllottedMinutes() - this.getMinutesUsed()) * overageFee;
    }

    private double calculateTax() {
        double tax =  .15;
        double overageAmount = calculateOverageAmount();
        return (this.getBaseCost() + overageAmount) * tax;
    }

    private double calculatePhoneBillAmount() {
        double overageAmount = calculateOverageAmount();
        double taxAmount = calculateTax();
        return this.baseCost + overageAmount + taxAmount;
    }

    public void printBill() {
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", this.getBaseCost()));
        System.out.println("Overage: $" + String.format("%.2f", this.calculateOverageAmount()));
        System.out.println("Tax: $" + String.format("%.2f", this.calculateTax()));
        System.out.println("Total: $" + String.format("%.2f", this.calculatePhoneBillAmount()));
    }


}
