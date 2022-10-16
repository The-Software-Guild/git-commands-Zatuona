import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {
        /* Write this using a do-while loop that continues to execute until the room is clean.
           Every time the loop executes, the parent should tell the teenager to clean their room.
           Each time the teenager is told to clean their room, it increases the chance the teenager will clean the room by 10%. So the first time they're told, there is only a 10% chance they'll clean it. The second time, there's a 20% chance. Use Random to calculate this "chance" check.
           However, by the 7th time, they're going to get grounded and have their Xbox confiscated. (Note: Use a break, not a compound condition, to stop the loop in that case.) */

        Random rng = new Random();

        int noOfTimesTold = 0;
        double chanceOfCleaning = 0;
        double teenChanceTolerance = rng.nextDouble();

        System.out.println(teenChanceTolerance);



        do {
            noOfTimesTold++;
            System.out.println("Go and clean your room now! (" + noOfTimesTold + ")");
            chanceOfCleaning +=0.1;

            if (noOfTimesTold == 7) {
                System.out.println("Right, I've had enough. This is the seventh time I've asked - your Xbox is getting binned");
            } else if (chanceOfCleaning > teenChanceTolerance) {
                System.out.println("Ok mum! I'll clean up :)");
            }

        } while (chanceOfCleaning < teenChanceTolerance && noOfTimesTold < 7);





    }
}