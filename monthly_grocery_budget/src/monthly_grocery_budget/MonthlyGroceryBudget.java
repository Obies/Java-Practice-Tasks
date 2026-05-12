//This application calculates the remaining budget for grocery, receiving input
//of the monthly grocery budget and total grocery cost from input received from the user
package monthly_grocery_budget;
import java.util.Locale;
import java.util.Scanner;

public class MonthlyGroceryBudget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//useLocale is used to accept "." as a decimal input for numbers
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		//Variables
		double monthly_grocery_budget;
		double breadPrice, milkPrice, vegePrice;
		double total_grocery_cost;
		double remaining_budget;
		
		//Prompts - these messages request input from the user for the
		//price of bread, milk and vegetables
		//The price of each item will be displayed to ensure the correct price is 
		//entered into the program from the user
		System.out.println("Please enter your monthly grocery budget:");
		monthly_grocery_budget = input.nextDouble();
		
		System.out.println("What is the price of bread:");
		breadPrice = input.nextDouble();
		
		System.out.println("What is the price of milk:");
		milkPrice = input.nextDouble();
		
		System.out.println("What is the price of vegetables:");
		vegePrice = input.nextDouble();
		
		//Performs the calculation operation for the total grocery cost 
		//and the remaining amount from the total monthly grocery budget
		total_grocery_cost = breadPrice + milkPrice + vegePrice;
		System.out.println("The total grocery cost is: " + total_grocery_cost);
		
		remaining_budget = monthly_grocery_budget - total_grocery_cost;
		System.out.println("The remaining budget for grocery is: " + remaining_budget);
	}

}
