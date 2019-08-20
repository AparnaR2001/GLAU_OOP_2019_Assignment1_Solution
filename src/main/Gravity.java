/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;
import java.util.Scanner;
// uncomment the above line to use input in your program.

public class Gravity {
	// TODO 1: Create the main method
	public static void main(java.lang.String[] args) {
		/* TODO 2:
		 *   a. Declare all your necessary variables inside main method.
		 *   b. Declare a constant for 'gravity', assume the value to be 9.8
		 *   c. Calculate the result and print it to the screen.
		 * */
			Scanner scanner = new Scanner(System.in);
			double time= scanner.nextDouble();
			double speed=(time*9.8);
			double distance=(time*9.8*time)/2;
			System.out.println("The speed of the object at "+time+" seconds after its release is "+speed+" and the distance the object has travelled in the "+time+" seconds after the relase is "+distance);

	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
