//Voting - Application determines if the user is eligible to vote or not
package voting;
import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student name: Obakeng Mothibedi
		//Student number: 74301004
		Scanner input = new Scanner(System.in);
		
		//Variable
		int age;
		
		//Prompts the user for their age
		System.out.print("Please enter your age to determine if you can vote: ");
		age = input.nextInt();
		
		//Decision-making - branching(if-else)
		if(age >= 18) {
			System.out.print("You are eligible to vote");
		}
		else {
			System.out.print("You are not eligible to vote");
		}
	}

}
