//Fig2.25 Program receives integer input and determines if its divisible by 3
package int_divisible_3;
import java.util.Scanner;

public class IntDivi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Variable
		System.out.print("Please enter an integer: ");
		int num1 = input.nextInt();
		
		if(num1 % 3 == 0) {
			System.out.print("Num1 is divisible by 3, as remainder is 0");
		}
		else {
			System.out.print("Num1 is not divisible by 3, it contains a remainder");
		}
	}

}
