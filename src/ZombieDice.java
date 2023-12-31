import java.util.ArrayList;
import java.util.List;

public class ZombieDice extends Dice {

    private static List<String> colorArray = new ArrayList<>(3);
     private static int nBrain;
    private String color;
    private int nShotguns;
    private static int nFeet = 2;
    private String currentColor;

    public ZombieDice(){}
    public ZombieDice(String color) {
        super(6);
        this.color = color;


        Dice.setnFeet(2);

    }

    public String randomColor(){
        int randomIndex = (int) Math.floor(Math.random()*3);
        Dice dice = new Dice();
        ZombieDice.colorArray.add("red");
        ZombieDice.colorArray.add("green");
        ZombieDice.colorArray.add("yellow");
        for (String item : ZombieDice.colorArray){
            if (item.equals("green")) {
                ZombieDice.setnBrain(3);;
                setnShotgun(1);
            } else if (item.equals("red")) {
                ZombieDice.setnBrain(1);;
                ZombieDice.setnShotgun(3);
            } else if (item.equals("yellow")) {
                ZombieDice.setnBrain(2);;
                ZombieDice.setnShotgun(2);
            }
        }
        dice.setCurrentColor( ZombieDice.colorArray.get(randomIndex));
        return dice.getCurrentColor();
    }
    public void addDiceToPlayer(){
        Player player = new Player();
        System.out.println( this.randomColor());
        System.out.println("--------------");

        for (int i = 0; i < 3; i++) {
            this.currentColor = randomColor();
            player.getDice().add(new ZombieDice( this.currentColor));
            player.getDice().get(i).setCurrentColor( this.currentColor);
        }
        System.out.println(player.getDice());
    }
    public static List<String> getColorArray() {
        return colorArray;
    }

    public static void setColorArray(List<String> colorArray) {
        ZombieDice.colorArray = colorArray;
    }

    public static int getnBrain() {
        return nBrain;
    }

    public static void setnBrain(int nBrain) {
        ZombieDice.nBrain = nBrain;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getnShotguns() {
        return nShotguns;
    }

    public void setnShotguns(int nShotguns) {
        this.nShotguns = nShotguns;
    }

    public static int getnFeet() {
        return nFeet;
    }

    public static void setnFeet(int nFeet) {
        ZombieDice.nFeet = nFeet;
    }


}
