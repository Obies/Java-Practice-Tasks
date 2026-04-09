//Fix logical errors in program so that body weight classification works correctly
package test2bmi;
import java.util.Locale;
import java.util.Scanner;

public class Test2BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter BMI value: ");
        double bmi = input.nextDouble();

        String category = "";

        if (bmi >= 30)
        {
            category = "Obese";
        }
        else
        {
        	 if (bmi >= 25)
             {
                 category = "Overweight";
             }
            else
            {
            	if (bmi >= 18.5)
                {
                    category = "Normal";
                }
                else
                {
                    category = "Underweight";
                }
            }
        }

        System.out.println("BMI category: " + category);
	}

}
