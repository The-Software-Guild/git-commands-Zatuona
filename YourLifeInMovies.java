import java.util.Scanner;

public class YourLifeInMovies {
    public static void main(String[] args){

  /**Write a program that displays a different message based on the year someone was born to make them feel old.

   If they were born before 2005, print out that Pixar's 'Up' came out over a decade ago.
   If they were born before 1995, print out that the first Harry Potter came out over 15 years ago.
   If they were born before 1985, print out Space Jam came out not last decade, but the one before THAT.
   If they were born before 1975, print out that the original Jurassic Park release is closer to the first lunar landing than it is to today.
   If they were born before 1965, print out that the MASH TV series has been around for almost half a century!
   Note: A person who is born in 1980 should display three messages, one for being born before 2005, one for 1995, and finally for 1985.

   */

        String name ="";
        int birthYear;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Hey, let's play a game! What's your name?");
        name = myScanner.nextLine();

        System.out.println("Ok, " + name + ", when were you born?");
        birthYear = myScanner.nextInt();

        System.out.println("Well " + name + "....");

        if (birthYear < 2005){
            System.out.println("Pixar's 'Up' came out over a decade ago");

            if (birthYear < 1995) {
                System.out.println("the first Harry Potter came out over 15 years ago");

                if (birthYear < 1985){
                    System.out.println("Space Jam came out not last decade, but the one before THAT");

                    if (birthYear < 1975){
                        System.out.println("the original Jurassic Park release is closer to the first lunar landing than it is to today.");

                        if (birthYear < 1965) {
                            System.out.println("the MASH TV series has been around for almost half a century!");
                        }

                    }

                }

            }

        } else {
            System.out.println("You're probably too young to know any of these films kiddo.");
        }


    }
}
