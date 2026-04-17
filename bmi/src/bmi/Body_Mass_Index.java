//Program calculates Body Mass Index from users weight(KG) and height(meters) and shows classification
package bmi;
import java.util.Locale;
import java.util.Scanner;

public class Body_Mass_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Uses "useLocale" to input weight and height in the locale format specified
		//Using the British local format it uses 
		Scanner input = new Scanner(System.in).useLocale(Locale.UK);
		
		//Variables used 
		double weight;
		double height;
		
		//Prompt - asks users for their weight and height
		System.out.print("Please enter your weight: ");
		weight = input.nextDouble();
		
		System.out.print("Please enter your height and ensure to use a dot: ");
		height = input.nextDouble();
		
		//formula to calculate BMI
		double bmi = weight / (height * height);
		
		System.out.println("Your Body Mass Index is: " + bmi);
		
		//Branching - will use if statements 
		if(bmi > 30) {
			System.out.print("Obese");
		}
		if(bmi >= 25 && bmi <= 29.9) {
			System.out.print("Overweight");
		}
		if(bmi >= 18.5 && bmi <= 24.9) {
			System.out.print("Normal");
		}
		if(bmi < 18.5) {
			System.out.print("Underweight");
		}
	}

}
