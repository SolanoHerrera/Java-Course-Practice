package chapter3practice;
//If, If-Else, if-Else-if, Switch
import java.util.Scanner;

/*
Crear un programa que pregunte para ingresar las cantidades de monedas.
si la suma de las cantidades es igual a 1 dolar se gana el juego
 */
public class GameChangeForADollar {
    public static void main(String []args){

        double penniesvalue = 0.01;
        double nickelsvalue = 0.05;
        double dimesvalue = 0.10;
        double quartersvalue = 0.25;

        System.out.println("Hello! Welcome to Change For A Dollar");

        System.out.println("How many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();
        System.out.println("How many nickels would yo like?");
        int nickels = scanner.nextInt();
        System.out.println("How many dimes would you like?");
        int dimes = scanner.nextInt();
        System.out.println("How many quarters would you like?");
        int quarters = scanner.nextInt();
        scanner.close();

        double amountxvaluep = pennies * penniesvalue;
        double amountxvaluen = nickels * nickelsvalue;
        double amountxvalued = dimes * dimesvalue;
        double amountxvalueq = quarters * quartersvalue;
        double totalvalue = amountxvaluep + amountxvaluen + amountxvalued + amountxvalueq ;
        double less = 1 - totalvalue;
        double excess = totalvalue - 1;
        System.out.println("Your total value is $" + String.format("%.2f", totalvalue));


        if(totalvalue == 1){
            System.out.println("Congratulations! You win the game");
        } else if(totalvalue < 1){
            System.out.println("Its less than 1 dollar, you need $" + String.format("%.2f", less));
        }
        else{
            System.out.println("Its more than 1 dollar, you are over $" + String.format("%.2f", excess));
        }



    }
}
