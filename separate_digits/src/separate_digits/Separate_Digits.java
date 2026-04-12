//Fig2.30: Application takes a five digits integer and separates the numbers into individual digits
package separate_digits;
import java.util.Scanner;

public class Separate_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Variable
		int five_digit;
		
		System.out.print("Please enter a five digit number: ");
		five_digit = input.nextInt();
		
		//Adds the inputted five_digits variable into a new data type
		//Converted to a string from an int
		String string_digits = String.valueOf(five_digit);
		
		//conversion to String is easier to print the numbers out individually
		//The string_digits variable type is converted to a String[] array data type 
		String[] ind_numbers = string_digits.split("(?<=.)");
		
		//Loop is used - to print out the iterations
		//for loop is used as iteration number is known
		//ind_numbers[i] is used as it prints the numbers in the array on each iteration run
		// " " are used to create 3 spaces in printing the numbers out individually
		for(int i = 0; i < ind_numbers.length; i++) {
			System.out.print(ind_numbers[i] + " " + " " + " ");
		}
	}

}
