package chapter2practica;
//Java Fundamentals

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        // Adjetivo
        System.out.println("Enter an adjetive");
        Scanner scanner = new Scanner(System.in);
        String adjetive = scanner.next();

        // Season of the year
        System.out.println("Enter a season of the year");
        String seasonofyear = scanner.next();

        // Un numero cualquiera
        System.out.println("Enter a whole number");
        int wholenumber = scanner.nextInt();
        scanner.close();

        // Oracion completa
        System.out.println("on a " + adjetive + " " + seasonofyear + "day, i drink a minimun of " + wholenumber + " cups of coffe");
    }
}
