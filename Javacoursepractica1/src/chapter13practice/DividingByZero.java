package chapter13practice;
//Exception

public class DividingByZero  {

    public static void main (String [] args){

        try{
            int c = 30/0;
        }catch (ArithmeticException e){
            System.out.println("Dividing by Zero is impossible");
        }finally {
            System.out.println("Division is fun!");
        }
        }
    }
