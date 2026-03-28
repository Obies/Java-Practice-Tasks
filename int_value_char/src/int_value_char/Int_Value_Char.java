//Fig2.29: The application displays the integer value of a specific character
package int_value_char;

public class Int_Value_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		char a = 'A';
		char b = 'B';
		char c = 'C';
		char A = 'a';
		char B = 'b';
		char C = 'c';
		char zero = '0';
		char one = '1';
		char two = '2';
		char dollar = '$';
		char star = '*';
		char add = '+';
		char slash = '/';
		char blank = ' ';
		
		//Display the character value of the variables
		System.out.println("The character value is: " + a);
		System.out.println("The character value is: " + b);
		System.out.println("The character value is: " + c);
		System.out.println("The character value is: " + A);
		System.out.println("The character value is: " + B);
		System.out.println("The character value is: " + C);
		System.out.println("The character value is: " + zero);
		System.out.println("The character value is: " + one);
		System.out.println("The character value is: " + two);
		System.out.println("The character value is: " + dollar);
		System.out.println("The character value is: " + star);
		System.out.println("The character value is: " + add);
		System.out.println("The character value is: " + slash);
		System.out.println("The character value is: " + blank);
		
		//Convert them to integer type
		int lettera = Character.getNumericValue(a);
		int letterb = Character.getNumericValue(b);
		int letterc = Character.getNumericValue(c);
		int letterA = Character.getNumericValue(A);
		int letterB = Character.getNumericValue(B);
		int letterC = Character.getNumericValue(C);
		int numZero = Character.getNumericValue(zero);
		int numOne = Character.getNumericValue(one);
		int numTwo = Character.getNumericValue(two);
		int dolla = Character.getNumericValue(dollar);
		int naledi = Character.getNumericValue(star);
		int plus = Character.getNumericValue(add);
		int hyphen = Character.getNumericValue(slash);
		int space = Character.getNumericValue(blank);
		
		//Print statements to output the conversion from character to integer
		System.out.printf("This character %s has an integer value of %d%n", 'A', lettera);
		System.out.printf("This character %s has an integer value of %d%n", 'B', letterb);
		System.out.printf("This character %s has an integer value of %d%n", 'C', letterc);
		System.out.printf("This character %s has an integer value of %d%n", 'A', letterA);
		System.out.printf("This character %s has an integer value of %d%n", 'b', letterB);
		System.out.printf("This character %s has an integer value of %d%n", 'c', letterC);
		System.out.printf("This character %s has an integer value of %d%n", '0', numZero);
		System.out.printf("This character %s has an integer value of %d%n", '1', numOne);
		System.out.printf("This character %s has an integer value of %d%n", '2', numTwo);
		System.out.printf("This character %s has an integer value of %d%n", '$', dolla);
		System.out.printf("This character %s has an integer value of %d%n", '*', naledi);
		System.out.printf("This character %s has an integer value of %d%n", '+', plus);
		System.out.printf("This character %s has an integer value of %d%n", '/', hyphen);
		System.out.printf("This character %s has an integer value of %d%n", ' ', space);

	}

}
