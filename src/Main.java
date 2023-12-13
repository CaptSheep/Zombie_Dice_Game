import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner inputPlayer = new Scanner(System.in);
        List<Integer> sortPlayerList = new ArrayList<>();

        System.out.println("Welcome to the ZombieDice game!");
        System.out.println("How many player in this round? Choose 3-6");
        int  numPlayer = Integer.parseInt(inputPlayer.nextLine());
        while(numPlayer < 3 || numPlayer > 6) {
            System.out.println("Try again. You can only have between 3 to 6 players per game.");
            numPlayer = Integer.parseInt(inputPlayer.nextLine());
        }
        List<Player> players = new ArrayList<>();
        for(int i = 1; i <= numPlayer; i++) {
            System.out.println("Enter name of Player " + i + ": ");
            String name = inputPlayer.nextLine();
            Player player = new Player(name);
            players.add(player);
        }
        for (Player item : players){
            item.rollDice();
            sortPlayerList.add(item.getNumberOfDice());
            item.setGetDiceAfterRoll(item.getNumberOfDice());
            System.out.println(item);
        }

       do{
           int currentPlayer = 0;
            System.out.println("Let's start the ZombieDice Game:");
            System.out.println("Initializing...");
           players.sort(((o1, o2) -> o2.getGetDiceAfterRoll() - o1.getGetDiceAfterRoll()));
           System.out.println("After roll Dice , this is the position of player ");
           Player player = players.get(currentPlayer);
            for (Player item : players){
                currentPlayer = players.indexOf(item);
                System.out.println("Player " + players.get(currentPlayer).getName());

            }
           System.out.println("It is " + player.getName() + "'s turn.");
            System.out.println("Please press Enter to roll the Dice.");

            inputPlayer.nextLine();

//            player.clearDice();
//            player.addDice();
//            System.out.println("You have the following dices: ");
//            for (Dice UsedDice : player.getDice()) {
//
//
//            }
           break;
//
        }
       while (players.size() != 0);




    }
}