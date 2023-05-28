package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base cost of your phone plan");
        double basePlan = scanner.nextDouble();

        System.out.println("Enter overage minutes: ");
        double overageMinutes = scanner.nextDouble();

        double overageAmount = calculateOverageAmount(overageMinutes);
        double taxAmount = calculateTax(basePlan, overageAmount);
        double phoneBillAmount = calculatePhoneBillAmount(basePlan, overageAmount, taxAmount);

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + basePlan);
        System.out.println("Overage: $" + overageAmount);
        System.out.println("Tax: $" + taxAmount);
        System.out.println("Total: $" + phoneBillAmount);
    }

    private static double calculatePhoneBillAmount(double basePlan, double overageAmount, double taxAmount) {
        return basePlan + overageAmount + taxAmount;
    }

    private static double calculateOverageAmount(double overageMinutes) {
        double overageFee = .25;
        return overageMinutes * overageFee;
    }

    private static double calculateTax(double basePlan, double overageAmount) {
            double tax =  .15;
            return (basePlan + overageAmount) * tax;
    }
}
