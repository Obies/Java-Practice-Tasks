//This application calculates the number of years taken to build the pyramid
//from using the estimated number of stones and average weight of each stone
package great_pyramid_stats;
import java.util.Scanner;

public class Great_Pyramid_Stats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Variables
		int num_of_stones;
		int avg_stone_weight;
		int num_of_build_years;
		int yearlyweight, hourlyweight, minuteweight;
		
		
		//Prompt - requests the Pyramid statistics from the user
		//Research - 2,300,000 stones
		System.out.println("Please enter the number of stones used for the pyramid: ");
		num_of_stones = input.nextInt();
		
		//Research - 2267.96kg
		System.out.println("Please enter the average weight of the stones used: ");
		avg_stone_weight = input.nextInt();
		
		//Research - 20 years
		System.out.println("Please enter the number of years estimated to build the pyramid: ");
		num_of_build_years = input.nextInt();
		
		//Calculation - this calculates the total stone size
				int total_stone_size = num_of_stones * avg_stone_weight;
		
		//Process this calculates the average weight it took to build the pyramid
		//in a year, per hour and minutes.
		
		yearlyweight = total_stone_size / num_of_build_years;
		System.out.println("The yearly weight is: " + yearlyweight);
		
		hourlyweight = yearlyweight / (365 * 24);
		System.out.println("The hourly weight is: " + hourlyweight);
		
		minuteweight = hourlyweight / 60;
		System.out.println("The hourly weight is: " + minuteweight);
	}
}
