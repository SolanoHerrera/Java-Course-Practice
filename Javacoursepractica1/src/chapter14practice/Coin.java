package chapter14practice;

import java.util.Random;

public class Coin {

    public static final String HEADS = "Heads";
    public static final String TAILS = "Tails";
    private String side;


    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }
    public String flip(){
        if (new Random().nextBoolean()){
            setSide(HEADS);
        }
        else{
            setSide(TAILS);
        }
        return getSide();
    }
}
