//Fig 2.15: Comparison.java
//Compares integers using if-statements, relational operators and equality operators
package comparison;
import java.util.*;

public class Comparison {
	
	//main method begins the execution of the Java application
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner receives input from the keyboard
		Scanner input = new Scanner(System.in);
		
		int num1; //First number entered
		int num2; //Second number entered
		
		System.out.print("Please enter the first number: ");
		num1 = input.nextInt(); //reads the first number entered
		
		System.out.print("Please enter the second number: ");
		num2 = input.nextInt(); //reads the second number entered
		
		if(num1 == num2) {
			System.out.printf("%d == %d%n", num1, num2);
		}
		if(num1 != num2) {
			System.out.printf("%d != %d%n", num1, num2);
		}
		if(num1 < num2) {
			System.out.printf("%d < %d%n", num1, num2);
		}
		if(num1 > num2) {
			System.out.printf("%d > %d%n", num1, num2);
		}
		if(num1 <= num2) {
			System.out.printf("%d <= %d%n", num1, num2);
		}
		if(num1 >= num2) {
			System.out.printf("%d >= %d%n", num1, num2);
		}
	}//end of main method

}//end of class Comparison
