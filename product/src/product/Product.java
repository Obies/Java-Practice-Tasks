//Fig1.1: Product.java The program will calculate the product of 3 integers
package product;
import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		int result;
		
		System.out.print("Enter the first integer: ");
		x = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		y = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		z = input.nextInt();
		
		result = x * y * z;
		
		System.out.printf("The product is: %d%n", result);
	}

}
