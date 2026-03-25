//Fig2.15:This program receives user input integers and prints the square of each, the sum of their squares
//and the difference of the squares
package arithmetic;
import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner receives input from keyboard
		Scanner input = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		
		System.out.print("Please enter an integer: ");
		num1 = input.nextInt();
		
		System.out.print("Please enter an integer: ");
		num2 = input.nextInt();
		
		//Prints out the square of the integers
		System.out.printf("The square of num1 is: %d%n", num1 * num1);
		System.out.printf("The square of num2 is: %d%n", num2 * num2);
		
		//Prints out the sum of the integers square
		System.out.printf("%nThe sum of the squares is: %d%n", (num1 * num1) + (num2 *num2));
		
		//Prints out the difference between the 1st and 2nd integer squares
		System.out.printf("The difference between the 1st and 2nd integer is: %d", (num1 * num1) - (num2 * num2));
}
}