package chapter4practice;
/*
Realizar un juego en donde se debe lanzar el dado 5 veces.
Si la suma de los mismos es igual a 20 se gana el juego.
 */

import java.util.Random;
import java.util.Scanner;

public class RollTheDieGame {
    public static void main(String [] args){

        int rolls = 5;
        int currentspace = 0;
        int lastspace = 20;

        Random random = new Random();
        System.out.println("Welcome to the Roll The Die Game!!");
        System.out.println();

        for (int i=1; i<=rolls; i++){

        int die = random.nextInt(6) + 1;
            System.out.println("You have rolled a #" + die);
            currentspace = currentspace + die;
            System.out.println("Your current space is " + currentspace + " keep going");


        if (currentspace == lastspace ){
            System.out.println("Congratulations! You win");
        }
        else if(currentspace > lastspace){
            System.out.println("Sorry that take you past. You loose");
        }
        else if(i==rolls && currentspace < lastspace){
            System.out.println("Sorry you didnt make it all. You loose");
        }
        System.out.println();
        }

    }
}

