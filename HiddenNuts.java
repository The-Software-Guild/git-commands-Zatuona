import java.util.Random;

public class HiddenNuts {
    public static void main(String[] args) {


        /**Squirrels like to hide their nuts, but they're not always very good about finding them again.

         Using the code snippet below as a base, iterate through the hiding spaces and find out where the squirrel put his nut and print it to the screen. */


        String[] hidingSpots = new String[100];
        Random squirrel = new Random(); //name of the random generator

        // int randomIndex = squirrel.nextInt(hidingSpots.length);

        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        // We have allocated a random index as "nut"


        System.out.println("The nut has been hidden ...");


        for (int i = 0; i < hidingSpots.length; i++) {
            if (hidingSpots[i] == "Nut") {
                System.out.println("Found it! It's at #" + squirrel.nextInt(hidingSpots.length));
            }

        }
    }
}
