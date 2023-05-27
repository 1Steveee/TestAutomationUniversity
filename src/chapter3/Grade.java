package chapter3;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade: ");

        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String message;


        //if you forget to include a break, it will continue to the next code block.
        switch (grade) {
            case "A":
                message = "Amazing Student";
                break;
            case "B":
                message = "Good Student";
                break;
            case "C":
                message = "Let's study more";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Let's get some tutoring";
                break;
            default:
                message = "Error invalid grade";
                break;
        }

        System.out.println(message);

    }
}