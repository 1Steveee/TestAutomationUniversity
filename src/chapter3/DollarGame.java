package chapter3;

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args) {
        double penniesVal = .01;
        double nickelsVal = .05;
        double dimesVal =   .10;
        double quartersVal = .25;
        double usdDollar = 1;




        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pennies? ");
        double pennies = scanner.nextInt();

        System.out.println("How many nickels? ");
        double nickels = scanner.nextInt();

        System.out.println("How many dimes? ");
        double dimes = scanner.nextInt();

        System.out.println("How many quarters? ");
        double quarters = scanner.nextInt();

        scanner.close();

        double totalCount = (penniesVal * pennies) + (nickelsVal * nickels)
                + (dimesVal * dimes) + (quartersVal * quarters);


        if (totalCount > usdDollar) {
            double remaingCoinAmount = totalCount - usdDollar;
            System.out.println("You went over by " + remaingCoinAmount);
        } else if (totalCount == usdDollar) {
            System.out.println("Congrats you got the right amount");
        } else {
            double shortCoinAmount = usdDollar - totalCount;
            System.out.println("You are short by " + shortCoinAmount);
        }

    }
}
