//Program determines from assessment marks if you pass the module or not
package result_classic;
import java.util.Scanner;

public class Result_Classification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Variables
		double As1, As2, As3, As4, As5;
		double As6;
		double year_mark, final_mark;
		
		System.out.print("Please enter your mark for assessment 1: ");
		As1 = input.nextInt();
		
		System.out.print("Please enter your mark for assessment 2: ");
		As2 = input.nextInt();
		
		System.out.print("Please enter your mark for assessment 3: ");
		As3 = input.nextInt();
		
		System.out.print("Please enter your mark for assessment 4: ");
		As4 = input.nextInt();
		
		System.out.print("Please enter your mark for assessment 5: ");
		As5 = input.nextInt();
		
		System.out.print("Please enter your exam mark for assessment 6: ");
		As6 = input.nextInt();
		
		//Process statements
		year_mark = (As1 + As2 + As3 + As4 + As5) / 5;
		final_mark = (year_mark / 100 * 20) + (As6 / 100 * 80);
		
		//Decision-making statements(branching)
		//Ensure to print out the result of the process statements variables to see
		//why it branched into a specific decision, not just outputting the answer
		if(year_mark > 40) {
			System.out.println("Your year mark is: " + year_mark);
		}
		else {
			System.out.print("You fail the module");
		}
		if(final_mark > 50) {
			System.out.print("Your final mark is: " + final_mark + "\n");
			System.out.print("You made it baby, You pass the module");
		}
		else {
			System.out.print("You fail the module");
		}
		
	}

}
