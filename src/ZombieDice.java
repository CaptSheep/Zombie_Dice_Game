import java.util.ArrayList;
import java.util.List;

public class ZombieDice extends Dice {

    private static List<String> colorArray = new ArrayList<>(3);
   private int nBrain;
   private String color;
    private int nShotguns;
    private int nFeet = 2;

    public ZombieDice(String color) {
        super(6);
        this.color = color;

    }


}
