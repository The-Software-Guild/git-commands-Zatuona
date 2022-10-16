import java.util.Scanner;

public class GuessMe {

    public static void main(String[] args){

        int chosenNumber = 54;
        int numberGuess;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("I've chosen a number and I bet you can't guess it... go on!");
        numberGuess = myScanner.nextInt();


        if (numberGuess == chosenNumber){
            System.out.println("Omg! you've guessed the number!");
        } else if (numberGuess < chosenNumber) {
            System.out.println("Aww, " + numberGuess + "? Your guess is too low. I chose 54!");
        } else {
            System.out.println("Aww, " + numberGuess + "? Your guess is way too high. I chose 54!");
        }
    }
}
