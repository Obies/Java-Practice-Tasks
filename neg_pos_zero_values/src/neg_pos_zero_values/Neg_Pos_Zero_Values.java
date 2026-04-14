//Program inputs 5 integers and prints out the number of negative, positive and zero values
package neg_pos_zero_values;
import java.util.Scanner;

public class Neg_Pos_Zero_Values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Variables
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		//Variables store the number of positive, negative and zeros entered
		int pos_numbers = 0;
		int neg_numbers = 0;
		int zero_values = 0;
		
		//Prompt - asks users to input 
		System.out.print("Please enter the first number: ");
		num1 = input.nextInt();
		
		System.out.print("Please enter the second number: ");
		num2 = input.nextInt();
		
		System.out.print("Please enter the third number: ");
		num3 = input.nextInt();
		
		System.out.print("Please enter the fourth number: ");
		num4 = input.nextInt();
		
		System.out.print("Please enter the fifth number: ");
		num5 = input.nextInt();
		
		//Branching decision - process when the number is +, - or 0
		if(num1 > 0) {
			pos_numbers += 1;
		}
		if(num2 > 0) {
			pos_numbers += 1;
		}
		if(num3 > 0) {
			pos_numbers += 1;
		}
		if(num4 > 0) {
			pos_numbers += 1;
		}
		if(num5 > 0) {
			pos_numbers += 1;
		}
		
		//Checks if number is negative
		if(num1 < 0) {
			neg_numbers += 1;
		}
		if(num2 < 0) {
			neg_numbers += 1;
		}
		if(num3 < 0) {
			neg_numbers += 1;
		}
		if(num4 < 0) {
			neg_numbers += 1;
		}
		if(num5 < 0) {
			neg_numbers += 1;
		}
		
		//Checks number of zeros entered
		if(num1 == 0) {
			zero_values +=1;
		}
		if(num2== 0) {
			zero_values +=1;
		}
		if(num3 == 0) {
			zero_values +=1;
		}
		if(num4 == 0) {
			zero_values +=1;
		}
		if(num5 == 0) {
			zero_values +=1;
		}
		
		//Prints out the number of positive, negative and zeros entered
		System.out.println("The number of positive numbers entered is: " + pos_numbers);
		System.out.println("The number of negative numbers entered is: " + neg_numbers);
		System.out.println("The number of zero value numbers entered is: " + zero_values);
	}

}
