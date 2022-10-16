import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {
    public static void main(String[] args){

        Random rng = new Random ();

        int chosenNumber = rng.nextInt(201)-100;
        int numberGuess;
        int secondGuess;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("I've chosen a number and I bet you can't guess it... go on!");
        numberGuess = myScanner.nextInt();




        while (numberGuess != chosenNumber){
            if (numberGuess < chosenNumber) {
                System.out.println("Aww, " + numberGuess + "? Your guess is too low. Guess again e!");
                secondGuess = myScanner.nextInt();

                if (secondGuess < chosenNumber) {
                    System.out.println("Aww, " + secondGuess + "? Your guess is too low again. The answer is f" + chosenNumber);
                } else if (secondGuess > chosenNumber){
                    System.out.println("Aww, " + secondGuess + "? Your guess is too high this time! The answer is g" + chosenNumber);
                } else {
                    System.out.println("Omg you got it right! The answer is h-54" + chosenNumber);
                }

            } else if (numberGuess > chosenNumber) {
                System.out.println("Aww, " + numberGuess + "? Your guess is too high. Guess again!a");
                secondGuess = myScanner.nextInt();

                if (secondGuess < chosenNumber) {
                    System.out.println("Aww, " + secondGuess + "? Your guess is too low this time! The answer is b" + chosenNumber);
                } else if (secondGuess > chosenNumber){
                    System.out.println("Aww, " + secondGuess + "? Your guess is too high again! The answer is c" + chosenNumber);
                } else {
                    System.out.println("Omg you got it right! The answer is d" + chosenNumber);
                }
            }
        }

    }
}
