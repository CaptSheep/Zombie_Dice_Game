import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
    private String name;
    private int Score;
    private int gamesWon;
    private int getDiceAfterRoll ;
    private List<Dice> dice;

    Random random = new Random();

    public Player() {
    }

    public Player(String name) {
        this.name = name;
        this.Score = 0;
        this.gamesWon = 0;
        this.dice = new ArrayList<>();

    }
    public void setNumBrains(int nBrain) {
        this.Score = nBrain;
    }

//    public int getScore() {
//        return Dice.nBrain++;
//    }
    public String GamesWon() {
        return "Player win. Game End. What to play another game?";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDice(Dice UsedDice) {
        this.dice.add(UsedDice);
    }

    public void removeDice(Dice UsedDice) {
        this.dice.remove(UsedDice);
    }

    public List<Dice> getDice() {
        return this.dice;
    }

    public int getGetDiceAfterRoll() {
        return getDiceAfterRoll;
    }

    public void setGetDiceAfterRoll(int getDiceAfterRoll) {
        this.getDiceAfterRoll = getDiceAfterRoll;
    }

    public int rollDice() {
        int diceSide = (int)Math.floor(Math.random() * 6);
        return diceSide;
    }
    public int getNumberOfDice (){
        return this.rollDice();
    }
//
//    public int hasShotgun() {
//        int totalShotgun = 0;
//        for (Dice UsedDice : dice) {
//            totalShotgun += UsedDice.nShotgun;
//        }
//        return totalShotgun;
//    }

//    public int hasBrain() {
//        int totalBrain = 0;
//        for (Dice UsedDice : dice) {
//            totalBrain += UsedDice.nBrain;
//        }
//        return totalBrain;
//    }
//
//    public int hasFeet() {
//        int totalFeet = 0;
//        for (Dice UsedDice : dice) {
//            totalFeet += UsedDice.nFeet;
//        }
//        return totalFeet;
//    }

    public void RerollFootsteps() {
        List<Dice> FeetDice = new ArrayList<>();
        for (Dice UsedDice : dice) {
//            if (UsedDice.nFeet >= 1 || UsedDice.nFeet <= 3) {
//                FeetDice.add(UsedDice);
//            }
        }
        for (Dice UsedDice : FeetDice) {
            dice.remove(UsedDice);
          //  Dice newDice = new Dice(UsedDice.color);
            //dice.add(newDice);
        }
    }

    public void clearDice() {
        dice.clear();
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", Score=" + Score +
                ", gamesWon=" + gamesWon +
                ", getDiceAfterRoll=" + getDiceAfterRoll +
                ", dice=" + dice +
                ", random=" + random +
                '}';
    }
}
