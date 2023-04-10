package chapter10practice;

public class Banana extends Fruit {

    public Banana() {
        super(180);
    }

    public void removePeel() {
        System.out.println("Banana peel removed");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana juice is made");
    }
}
