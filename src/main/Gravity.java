/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;
import java.util.Scanner;
// uncomment the above line to use input in your program.

public class Gravity {
	public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        final double GRAVITY = 9.8;
        double time = sc.nextDouble();
        double speed = (time * GRAVITY);
        double distance = (time * GRAVITY * time) / 2;
        System.out.println("The speed of the object at " + time + " seconds after its release is " + speed + " and the distance the object has travelled in the " + time + " seconds after the relase is " + distance);
        sc.close();
	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
