//Fig2.24: Takes 5 integers and prints the largest and smallest numbers entered
package group_largest_smallest;
import java.util.Scanner;

public class GroupLargSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Variables where values are stored
		int num1, num2, num3, num4, num5, largest, smallest;
		
		//Prompts user to enter integers
		System.out.print("Please enter the first integer: ");
		num1 = input.nextInt();
		
		System.out.print("Please enter the second integer: ");
		num2 = input.nextInt();
		
		System.out.print("Please enter the third integer: ");
		num3 = input.nextInt();
		
		System.out.print("Please enter the fourth integer: ");
		num4 = input.nextInt();
		
		System.out.print("Please enter the fifth integer: ");
		num5 = input.nextInt();
		
		largest = num1;
		//Compares and determines the largest number
		if(num2 > largest) {
			largest = num2;
		}
		
		if(num3 > largest) {
			largest = num3;
		}
		
		if(num4 > largest) {
			largest = num4;
		}
		
		if(num5 > largest) {
			largest = num5;
		}
		
		System.out.printf("The largest number is: %d%n", largest);
		
		smallest = num1; //first the number is initialized as 88 then 96
		//Compares the integers and determines the smallest integer
		if(num2 < smallest) {
			smallest = num2;
		}
		if(num3 < smallest) {
			smallest = num3;
		}
		if(num4 < smallest) {
			smallest = num4;
		}
		if(num5 < smallest) {
			smallest = num5;
		}
		
		System.out.printf("The smallest value is: %d" , smallest);

	}

}
