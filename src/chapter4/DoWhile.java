package chapter4;

import java.util.Objects;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        System.out.println("Let's play a game");
        Scanner scanner = new Scanner(System.in);

        String playAgain;

        do {
            System.out.println("Enter two numbers so we can add them");
            System.out.println("Enter the first number: ");
            double firstNum = scanner.nextDouble();
            System.out.println("Enter the second number: ");
            double secondNum = scanner.nextDouble();

            double sumTotal = firstNum + secondNum;
            System.out.println("The total of the two number is: " + sumTotal);

            System.out.println("Do you want to play again? ");
            playAgain = scanner.next();

        } while (playAgain.equals("yes"));
    }
}
