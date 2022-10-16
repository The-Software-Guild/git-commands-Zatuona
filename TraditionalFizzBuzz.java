import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        /* Ask the user for a number.
        Use a for loop to count from zero, replacing every multiple of 3 with "fizz" and every multiple of 5 with "buzz". Multiples of BOTH should print out "fizz buzz".
        Every time you print out fizz, buzz, or fizz buzz - keep track. When you've reached the number received from the user - stop!
        Finish it all up with a large, all caps printout of "TRADITION!!!!!" */


        Scanner myScanner = new Scanner(System.in);

        int userNumber;
        int fizzingAndBuzzingCounter = 0;



        System.out.println("Please enter the number you want to stop at");
        userNumber = myScanner.nextInt();


        for (int i = 1; i <= userNumber; i++){

            if (i % 15 == 0) {
                System.out.println("fizzbuzz");
                fizzingAndBuzzingCounter++;

            } else if (i % 3 == 0){
                System.out.println("fizz");
                fizzingAndBuzzingCounter++;

            } else if (i % 5 == 0){
                System.out.println("buzz");
                fizzingAndBuzzingCounter++;
            }

            System.out.println(i);


        }

        System.out.println("TRADITION!!!!");

        System.out.println("How many units of fizzing and buzzing do you need in life? " + fizzingAndBuzzingCounter);





    }
}
