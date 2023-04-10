package chapter10practice;

public class MarketClass {

    public static void main (String [] args){

        Fruit apple = new Apple();
        ((Apple) apple).removeSeeds();
        ((Apple) apple).removePeel();
        apple.makeJuice();
    }
}
