public class WaitAWhile {
    public static void main(String[] args) {

        int timeNow = 5;
        int bedTime = 10;

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // Time passes
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
}

/* What happens if you change bedTime's value to 11?
10 o'clock will say stay up and 11 o'clock will say go to bed

What about using bedTime's original value, but changing timeNow to 11?
Will say "Oh it's 11 o'clock. Guess I should go to bed"

If you comment out timeNow++ at the end of the loop, what happens?
As it's a loop it will give an infinite loop for the response at 5 o clock

 */