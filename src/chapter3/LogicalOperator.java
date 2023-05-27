package chapter3;

import java.util.Scanner;

public class LogicalOperator {

    public static void main(String[] args) {

        int requiredSalary = 3000;
        int requiredYearsEmployed = 2;

        System.out.println("Enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your employer: ");
        double years = scanner.nextDouble();

        scanner.close();

        if (salary >= requiredSalary && years >= requiredYearsEmployed) {
            System.out.println("Congrats you qualify for a loan");
        } else {
            System.out.println("Sorry, you do not qualify for a loan");
        }
    }
}
