import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        //NOTE - Struggled to create a method to put the loop in and therefore found it difficult to repeat the last step of asking player to play game again


        int numOfPlays;
        String playerChoice;
        String computerChoice;

        //counters
        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;

        //import scanner and random classes

        Scanner myScanner = new Scanner(System.in);
        Random rng = new Random();

        //Creating an array of options in order to use the random feature to pick an index at random
        String[] possibleOptions = {"Rock", "Paper", "Scissors"};
        int randomIndex = rng.nextInt(possibleOptions.length);
        computerChoice = possibleOptions[randomIndex];




        System.out.println("Welcome to Rock, Paper, Scissors. \n" +
                "How many rounds would you like to play? (min 1 and max 10)");
        numOfPlays = myScanner.nextInt();


        //If numOfPlays is out of 1-10 range then display error

        if (numOfPlays < 1 || numOfPlays > 10) {
            System.out.println("Sorry there seems to be an error!");
        }


        // While loop to execute the game

        int i = 0;

        while (numOfPlays >= 1 && numOfPlays <= 10 && i < numOfPlays){
            //Can't use switch as it only works with single expressions apparently
            // Don't use == when comparing strings .equals() property is better

            System.out.println( "Please enter either \"Rock\", \"Paper\" or \"Scissors\"");
            playerChoice = myScanner.next();

            if (playerChoice.equals(computerChoice)){
                System.out.println("It's a tie this time");
                ties++;

            } else if (playerChoice.equals("Rock")  && computerChoice.equals("Paper")) {
                System.out.println("Haha, you lose! Computer gets a point");
                computerWins++;
            } else if (playerChoice.equals("Rock") && computerChoice.equals("Scissors")){
                System.out.println("Aww shucks. You get a point");
                playerWins++;
            } else if (playerChoice.equals("Paper") && computerChoice.equals("Rock")){
                System.out.println("Aww shucks. You get a point");
                playerWins++;
            } else if (playerChoice.equals("Paper") && computerChoice.equals("Scissors")) {
                System.out.println("Haha, you lose! Computer gets a point");
                computerWins++;
            } else if (playerChoice.equals("Scissors") && computerChoice.equals("Rock")) {
                System.out.println("Haha, you lose! Computer gets a point");
                computerWins++;
            } else if (playerChoice.equals("Scissors") && computerChoice.equals("Paper")) {
                System.out.println("Aww shucks. You get a point");
                playerWins++;
            }

            i++;

        }


        //End of game reflection

        System.out.println("I won " + computerWins + " times.");
        System.out.println("You won " + playerWins + " times.");
        System.out.println("We drew " + ties + " times.");

        whoWon(playerWins, computerWins);



    }


    // function/ method to declare who won
    public static void whoWon(int playerWins, int computerWins){
        if (playerWins > computerWins){
            System.out.println("Well done, you won the most games");
        } else if (computerWins > playerWins){
            System.out.println("I won the most games... yay!");
        } else {
            System.out.println("Hmm, the war continues. Neither of us won");
        }
    }

}



