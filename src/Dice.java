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


    }


    public int getnSides() {
        return nSides;
    }

    public void setnSides(int nSides) {
        this.nSides = nSides;
    }

    public static List<String> getColorArray() {
        return colorArray;
    }

    public static void setColorArray(List<String> colorArray) {
        Dice.colorArray = colorArray;
    }

    public String getCurrentColor() {
        return currentColor;
    }

    public void setCurrentColor(String currentColor) {
        this.currentColor = currentColor;
    }

    public static int getnBrain() {
        return nBrain;
    }

    public static void setnBrain(int nBrain) {
        Dice.nBrain = nBrain;
    }

    public static int getnShotgun() {
        return nShotgun;
    }

    public static void setnShotgun(int nShotgun) {
        Dice.nShotgun = nShotgun;
    }

    public static int getnFeet() {
        return nFeet;
    }

    public static void setnFeet(int nFeet) {
        Dice.nFeet = nFeet;
    }

    public int getGetDiceAfterRoll() {
        return getDiceAfterRoll;
    }

    public void setGetDiceAfterRoll(int getDiceAfterRoll) {
        this.getDiceAfterRoll = getDiceAfterRoll;
    }

    public List<Dice> getListDice() {
        return listDice;
    }

    public void setListDice(List<Dice> listDice) {
        this.listDice = listDice;
    }
}