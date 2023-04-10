package chapter5practice;
//Phone Bill Calculator.

import java.util.Scanner;

public class PhoneBillCalculator {
    static double charge = 0.25;
    static double tax = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        double costPlan = getPlan();
        double overageMinutes = getOverageMinutes();
        scanner.close();


        double overageTotal = getOverage(overageMinutes, charge);
        double subTotal = getSubTotal(costPlan, overageTotal);
        double totalTax = getTax(subTotal);
        double total = getTotal(subTotal, totalTax);
        System.out.println("Plan: $" + String.format("%.2f", costPlan));
        System.out.println("Overage: $" + String.format("%.2f",  overageTotal));
        System.out.println("Tax: $" + String.format("%.2f", totalTax));
        notifyTotal(total);


    }
    public static double getPlan(){
        System.out.println("Enter base cost of the plan");
        double costPlan = scanner.nextDouble();
        return costPlan;
    }
    public static double getOverageMinutes(){
        System.out.println("Enter overage minutes");
        double overageMinutes = scanner.nextDouble();
        return overageMinutes;
    }
    public static double getOverage(double overageMinutes, double charge){
        double overageTotal = overageMinutes * charge;
        return overageTotal;
    }
    public static double getSubTotal(double costPlan, double overageTotal){
        double subTotal = costPlan + overageTotal;
        return  subTotal;
    }
    public static double getTax(double subTotal){
        double totalTax = tax * subTotal;
        return totalTax;
    }
    public static double getTotal( double subTotal, double totalTax){
        double total = subTotal + totalTax;
        return total;
    }
    public static void notifyTotal(double total){
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
