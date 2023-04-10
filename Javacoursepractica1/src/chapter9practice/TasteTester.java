package chapter9practice;

public class TasteTester {

    public static void main(String [] args){

       Cake cake = new Cake("chocolate");
       cake.setPrice(20.00);
       System.out.println("Cake flavor: " + cake.getFlavor());
       System.out.println("Cake price: $" + cake.getPrice());

       BirthdayCake birthdayCake = new BirthdayCake();
       birthdayCake.setPrice(35.00);
       birthdayCake.setCandles(4);
       System.out.println("Birthday Cake flavor: " + birthdayCake.getFlavor());
       System.out.println("Birthday Cake price: $" + birthdayCake.getPrice());

       WeddingCake weddingCake = new WeddingCake();
       weddingCake.setPrice(45.00);
       weddingCake.setTiers(5);
       System.out.println("Wedding Cake flavor: " + weddingCake.getFlavor());
       System.out.println("Wedding Cake price: $" + weddingCake.getPrice());


    }
}
