package chapter11practice;

public class Farm {

    public static void main( String [] args){

        Animal pig = new Pig();
        pig.eat();
        pig.makeSound();

        Animal duck = new Duck();
        duck.eat();
        duck.makeSound();

    }
}
