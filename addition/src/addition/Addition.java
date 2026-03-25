//Fig2.7: Addition.java
//This program calculates the sum of two integers given by the user
package addition;
import java.util.Scanner; //The Scanner class is used for input

public class Addition {

	//main-method where the Java application begins
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The Scanner class is created to receive input from the keyboard
		Scanner input = new Scanner(System.in);
		
		int number1; //First number to add
		int number2; //Second number to add
		int sum; //the sum of number1 and number2
		
		System.out.println("Please enter number1: "); //prompt message
		number1 = input.nextInt(); //read first number from the user
		
		System.out.println("Please enter number2: "); //prompt message
		number2 = input.nextInt(); //reads second number from the user
		
		sum = number1 + number2; //add the numbers and stores the total in sum
		
		System.out.printf("Sum is %d%n", sum); //Prints out the sum
	}//end of main-method

}//end of class Addition
