//Fig2.17 The program takes 3 integers and displays the sum, average, product, smallest
//and largest of the numbers
package arithmetic_smallest_largest;
import java.util.Scanner;

public class Arithmet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Variables to store the integer values
		int num1;
		int num2;
		int num3;
		
		System.out.print("Please enter integer 1: ");
		num1 = input.nextInt();
		
		System.out.print("Please enter integer 2: ");
		num2 = input.nextInt();
		
		System.out.print("Please enter integer 3: ");
		num3 = input.nextInt();
		
		System.out.printf("The sum of the number is: %d%n", (num1 + num2 + num3));
		
		System.out.printf("The average of the numbers is: %d%n", ((num1 +num2 + num3) / 3));
		
		System.out.printf("The product of the numbers is: %d%n", (num1 * num2 * num3));
		
		if(num1 > num2 && num1 > num3) {
			System.out.print("Num1 is the largest\n");
			}
		else if(num2 > num1 && num2 > num3) {
			System.out.print("Num2 is the largest\n");		
			}
		else {
			System.out.print("Num3 is the largest\n");
		}
		//Compares which number is the smallest
		if(num1 < num2 && num1 < num3) {
			System.out.print("Num1 is the smallest");
		}
		else if(num2 < num1 && num2 < num3) {
			System.out.print("Num2 is the smallest");		
		}
		else {
			System.out.print("Num3 is the smallest");
		}
		
	}	

}
