//Application tests if correct grading symbol is displayed based on the grading criteria
package test1;
import java.util.Locale;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//".useLocale changes expected input from , to a . for input format
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		//Variables
		double dblMark = 0;
		String result = "";
		
		System.out.println("Symbols");
		
		//Input received from the user with a input received confirmation
		System.out.print("Enter the mark: ");
		dblMark = input.nextDouble();
		System.out.println("The mark entered is: " + dblMark);
		
		//Decision-making(branching) statements
		if (dblMark >=80)
		  {
			result = "A";
		  }
		else 
		{
			if (dblMark >=50) 
			{
			  result = "C";	
			}
			else
			{
				if (dblMark >= 65) 
					{
					   result = "B";
					}
				else 
				  {
					if (dblMark < 50)
						{
						   result = "D";
						}
				   }
				}
			}
		System.out.print("The result is " + result);
		}

	}


