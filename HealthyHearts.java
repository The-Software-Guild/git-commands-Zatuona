import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {

        //Ask user for their age and then calculate max heart rate and a healthy range for them

        Scanner myScanner = new Scanner(System.in);

        int age ;

        System.out.println("Welcome to the Healthy Heart Scanner. \nWhat's your age?");
        age = myScanner.nextInt();

        System.out.println("Your maximum heart rate should be " + maxHeartRate(age) + " beats per minute.");

        System.out.println("Your target HR Zone is between " + healthyLowerRange(maxHeartRate(age)) +  " and " + healthyHigherRange(maxHeartRate(age)) + " beats per minute.");


    }

    //-----------METHODS----------------

    // Method (function) to calculate the maximum heart rate
    public static int maxHeartRate(int age){
        return 220 - age;
    }

    //Method (function) to calculate the healthy lower heart range
    public static int healthyLowerRange (int maxHeartRate){

        return maxHeartRate/2;
    }

    //Method (function) to calculate the healthy higher heart range
    public static int healthyHigherRange (int maxHeartRate){

        // Casting using (int) will turn the double result into an int
        return (int)(maxHeartRate * 0.85);
    }




}
