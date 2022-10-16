import java.util.Scanner;

public class Birthstones {
    public static void main(String[] args){

        /** Now let's try a lookup application, where the user enters one value and the program returns a specific value from a list based on the input. In this case, we will ask the user for a month number and tell the user the corresponding month and birthstone. The following table shows a common list of birthstones that you can use for this program. */

        int monthNumber;
        String month;
        String birthstone = "";

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What birth month's stone would you like to know? \nType in the number");
        monthNumber = myScanner.nextInt();

        switch (monthNumber) {
            case 1:
                month = "January";
                birthstone = "Garnet";
                break;

            case 2:
                month = "February";
                birthstone = "Amethyst";
                break;

            case 3:
                month = "March";
                birthstone = "Aquamarine";
                break;

            case 4:
                month = "April";
                birthstone = "Diamond";
                break;

            case 5:
                month = "May";
                birthstone = "Emerald";
                break;

            case 6:
                month = "June";
                birthstone = "Pearl";
                break;

            case 7:
                month = "July";
                birthstone = "Ruby";
                break;

            case 8:
                month = "August";
                birthstone = "Peridot";
                break;

            case 9:
                month = "September";
                birthstone = "Sapphire";
                break;

            case 10:
                month = "October";
                birthstone = "Opal";
                break;

            case 11:
                month = "November";
                birthstone = "Topaz";
                break;

            case 12:
                month = "December";
                birthstone = "Turquoise";
                break;

            default:
                month = "Woah, invalid month!";
        }

        System.out.println(month + "'s birthstone is " + birthstone);






    }
}
