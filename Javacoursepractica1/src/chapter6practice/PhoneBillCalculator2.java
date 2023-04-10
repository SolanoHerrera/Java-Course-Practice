package chapter6practice;

public class PhoneBillCalculator2 {

    int id;
    double baseCost;
    double allottedMinutes;
    double  minutesUsed;

    public PhoneBillCalculator2(){ //Default constructor
        id = 56;
        baseCost = 80;
        allottedMinutes = 15;
        minutesUsed = 0;
    }
    public PhoneBillCalculator2(int id){ // Constructor that accepts the id only.
        this.id = id;

    }
    public PhoneBillCalculator2(int id, double baseCost, double allottedMinutes, double minutesUsed){ //constructor that accepts all the fields
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }
    public int getId(){return id;}
    public double getBaseCost(){return baseCost;}
    public double getAllottedMinutes(){return allottedMinutes;}
    public double getMinutesUsed(){return minutesUsed;}

    public void setId( int id){
        this.id = id;}
    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;}
    public void setAllottedMinutes(double allottedMinutes){
        this.allottedMinutes = allottedMinutes;}
    public void setMinutesUsed(double minutesUsed){
        this.minutesUsed = minutesUsed;};


    public double calculateOverageMinutes(){
        if (minutesUsed <= allottedMinutes){
            return 0;
        }
        double overageMinutes = minutesUsed * 0.25 + allottedMinutes * 0.25;
        return overageMinutes;
    }
    public double calculateTax(){
        return  0.15 * calculateOverageMinutes() + baseCost * 0.15;
    }
    public double calculateTotal(){
        return calculateOverageMinutes() + calculateTax() + baseCost;
    }
    public void Print(){
        System.out.println("ID: " + id );
        System.out.println("Base Cost: $" + baseCost );
        System.out.println("Overage Fee: $" + calculateOverageMinutes() );
        System.out.println("Tax: $" + calculateTax() );
        System.out.println("Total: $" + calculateTotal() );
    }

}
