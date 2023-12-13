import java.util.ArrayList;
import java.util.List;

public class Dice {

    int nSides = 6;
    private static List<String> colorArray = new ArrayList<>(3);
    private String currentColor;
    private static int nBrain;
    private static int nShotgun;
    private static int nFeet;
    private int getDiceAfterRoll ;

    private List<Dice> listDice = new ArrayList<>();


    public Dice(int side){
        this.nSides = side;
    }



    public Dice() {
        Dice.colorArray.add("red");
        Dice.colorArray.add("green");
        Dice.colorArray.add("yellow");
        for (String item : Dice.colorArray){
            if (item.equals("green")) {
            Dice.nBrain = 3;
            Dice.nShotgun = 1;
        } else if (item.equals("red")) {
            Dice.nBrain = 1;
            Dice.nShotgun = 3;
        } else if (item.equals("yellow")) {
            Dice.nBrain = 2;
            Dice.nShotgun = 2;
        }
        }
        Dice.nFeet = 2;
        int randomIndex = (int) Math.floor(Math.random()*3);
        this.currentColor = Dice.colorArray.get(randomIndex);

    }





}