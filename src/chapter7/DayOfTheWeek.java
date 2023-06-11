package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    public static String[] weekDays = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static void main(String[] args) {
        System.out.println("Enter the week day number you would like to find: ");

        Scanner scanner = new Scanner(System.in);
        int weekDay = scanner.nextInt();
        scanner.close();

        String dayOfTheWeek = getWeekDay(weekDay);
        printDayOfTheWeek(dayOfTheWeek);

    }

    private static void printDayOfTheWeek(String dayOfTheWeek) {
        System.out.println("The day of the week is " + dayOfTheWeek);
    }

    private static String getWeekDay(int weekDay) {
        return weekDays[weekDay];
    }
}
