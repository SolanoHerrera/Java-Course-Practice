package chapter7practice;

import java.util.Scanner;

public class DayOfWeek {

public static void main(String [] args){
    String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number of the day of the week");
    int day = scanner.nextInt();
    scanner.close();
    if (day > 7){
        System.out.println("Invalid entry, try again.");
    }
    System.out.println("Corresponding day: " + week[day - 1]);
}
}
