import edu.sjsu.macaldo.aaronjay.BetterRectangle;
import java.util.Scanner;

public class BetterRectangleTester {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
	    BetterRectangle userRectangle;
        int userWidth = 0;
	    int userHeight = 0;

        System.out.println("Welcome to my program that creates a rectangle and returns the area and perimeter!");
        System.out.println("Create a rectangle now.\nPlease enter the width: ");
        userWidth = userInput.nextInt();
        System.out.println("Please enter the height: ");
        userHeight = userInput.nextInt();
        userRectangle = new BetterRectangle(userWidth, userHeight);

        System.out.println("\nYou have created a rectangle with width " + userRectangle.width + " and height " + userRectangle.height + "!");
        System.out.println("The perimeter of your rectangle is: " + userRectangle.getPerimeter());
        System.out.println("The area of your rectangle is: " + userRectangle.getArea());
    }
}
