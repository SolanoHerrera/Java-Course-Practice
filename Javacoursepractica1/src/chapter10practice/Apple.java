package chapter10practice;

public class Apple extends Fruit{

    public Apple() {
        super(120);
    }

    public void removeSeeds(){
        System.out.println("Apple seeds removed");
    }
    public void removePeel(){
        System.out.println("Apple peel removed");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made");
    }
}
