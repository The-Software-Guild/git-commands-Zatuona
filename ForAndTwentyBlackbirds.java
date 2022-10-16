public class ForAndTwentyBlackbirds {
    public static void main(String[] args) {
        int birdsInPie = 0;
        for (int i = 0; i < 24; i++) {
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }

        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
}

        /* Change it so that the loop counts to the more traditional twenty-four birds.
         Also update the bird number printouts so the count is from 1 - 24. What did you change?

         i < 20 to i < 24. this changes the position at which the iteration should stop
         */