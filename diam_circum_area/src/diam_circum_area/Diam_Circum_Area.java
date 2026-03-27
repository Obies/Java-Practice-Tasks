//Fig 2.28 Application calculates the Diameter, Circumference and Area using 
//the input Radius given by the user
package diam_circum_area;
import java.util.Scanner;

public class Diam_Circum_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Variables
		int radius = 0;
		
		//Prompts user for integer
		System.out.print("Please enter the radius: ");
		radius = input.nextInt();
		
		//Prints Diameter as an integer
		System.out.printf("The Diameter of the circle is: %d%n", (2 * radius));
		
		//Prints Circumference and Area as floating-point
		System.out.printf("The Circumference of the circle is: %f%n", (2 * Math.PI * radius));
		
		System.out.printf("The Area of the circle is: %f", (Math.PI * (radius * radius)));
		
	}

}
