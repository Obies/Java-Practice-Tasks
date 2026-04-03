//Application checks if grocery spending is within budget
package grocery_budget;
import java.util.Scanner;

public class Grocery_Budget_Checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Variables
		int grocery_budget, total_grocery_cost;
		
		//Prompts the user to enter their grocery budget and total_grocery_cost
		System.out.print("Please enter your grocery budget: ");
		grocery_budget = input.nextInt();
		
		System.out.print("Please enter your total grocery cost: ");
		total_grocery_cost = input.nextInt();
		
		//Decision making - branching
		if(total_grocery_cost < grocery_budget) {
			System.out.print("You are within budget");
		} else {
			System.out.print("You have exceeded your budget");
		}
	}

}
