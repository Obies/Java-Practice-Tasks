//Program calculates the square and cube of the integers 0 up to 10 and prints the results in table form
package square_cube_table;

public class Square_Cube_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		int zero_ten = 10;
		
		
		//Printout of table
		System.out.print("number square cube\n");
		
		//Process where calculation takes place
		//Use printf and %d to make it easier to print out
		for(int i =0; i <= zero_ten; i++) {
			System.out.printf("%d      %d      %d\n", i, (i * i), (i * i * i));
		}

	}

}
