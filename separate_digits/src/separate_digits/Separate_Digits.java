//Fig2.30: Application takes a five digits integer and separates the numbers
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
		
		String string_digits = Integer.toString(five_digit);
	}

}
