import java.util.Scanner;

public class WindowsCalc {
    public static void main(String [] args){

        // declare variables for height and width
        float height;
        float width;

        // declare String variables to hold the user's height and
        // width input
        String stringHeight;
        String stringWidth;

        // declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;


        // declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);

        // get input from the user
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();                   //could also do myScanner.nextInt which will cause it to parse automatically
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();

        //Parse the input values to float values
        // NOTE: "float" has been removed as we are reassigning an already declared variable!

        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);

        //Do the necessary calculations
        areaOfWindow = height * width;
        perimeterOfWindow = 2 * ( height + width);

        /*
        COST
        The glass for the windows cost $3.50 per square METRE.
        The trim for the windows cost $2.25 per linear METRE.

        */

        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));

        // display the results to the user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost =  " + cost);

    }
}
