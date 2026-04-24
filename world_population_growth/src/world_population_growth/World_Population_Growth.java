//Application calculates the growth rate for 1,3,4 and 5 years from the current world population
//and annual world population growth rate(2026)
//This activity took me 3-4 days extra to complete
package world_population_growth;
import java.util.Scanner;

public class World_Population_Growth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double currentPop = 8300000000.0;        
		double growthRate = 0.84 / 100;       
		double year_one;
		double year_two;
		double year_three;
		double year_four;
		double year_five;
		
  
		System.out.println ("The current world population is: " + currentPop);       
		
		//Process - the calculation takes the currentPopulation + (the currentPop*growthRate)
		//The previous year population then becomes then new currentPop value
		year_one = currentPop + (currentPop * growthRate);
		System.out.println("The world population after 1 year is " + year_one);
		currentPop = year_one;
		
		year_two = currentPop + (currentPop * growthRate);
		System.out.println("The world population for the second year is " + year_two);
		currentPop = year_two;
		
		year_three = currentPop + (currentPop * growthRate);
		System.out.println("The world population for the third year is " + year_three);
		currentPop = year_three;
		
		year_four = currentPop + (currentPop * growthRate);
		System.out.println("The world population for the fourth year is " + year_four);
		currentPop = year_four;
		
		year_five = currentPop + (currentPop * growthRate);
		System.out.print("The world population for the fifth year is " + year_five);
		currentPop = year_five;
		
		
	}

}
