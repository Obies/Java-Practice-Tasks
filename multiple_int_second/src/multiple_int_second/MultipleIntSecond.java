//Fig 2.26: Application determines whether the first number tripled is
//a multiple of the second number doubled and prints the result
package multiple_int_second;
import java.util.Scanner;

public class MultipleIntSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Variables
		int num1;
		int num2;
		int check;
		
		//Prompts user
		System.out.print("Please enter the first integer: ");
		num1 = input.nextInt();
		
		System.out.print("Please enter the second integer: ");
		num2 = input.nextInt();
		
		check = num1 % num2;
		
		//Compares if it is a multiple of the second number or not
		if(check == 0) {
			System.out.print("Num1 is a multiple of num2");
		}
		else {
			System.out.print("Num1 is not a multiple of num2");
		}
	}

}
