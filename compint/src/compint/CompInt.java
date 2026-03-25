//Fig1.16: The application takes one integer and displays whether the number and it's square 
//are greater than, equal to, not equal or less than 100
package compint;
import java.util.Scanner;

public class CompInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Variables 
		int x = 0;
		int square = x * x;
		
		System.out.print("Please enter a integer: ");
		x = input.nextInt();
		
		System.out.printf("Square is: %d%n", (x * x));
		
		//Compares the integer entered
		if(x > 100)
		System.out.print("\nThe integer is greater than 100");
		if(x < 100)
			System.out.print("The integer is less than 100");
		if(x == 100)
			System.out.print("The integer is equal to 100");
		else
			System.out.print("\nThe integer is not equal to 100");
			
	}

}
