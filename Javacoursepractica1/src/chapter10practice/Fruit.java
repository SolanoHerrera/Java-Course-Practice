package chapter10practice;

public class Fruit {

    protected double calories;

    public Fruit(double calories) {
        setCalories(0);
    }

    public void makeJuice() {
        System.out.println("Juice is made");
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
