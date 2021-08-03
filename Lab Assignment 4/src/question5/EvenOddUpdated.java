package question5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOddUpdated {

	public static void main(String[] args) {
		
		Scanner obj1 = new Scanner(System.in);
		
		try {
			
			System.out.println("Please enter a number or enter ‘-1’ if you want to quit: ");
			int input = obj1.nextInt();
			
			if(input == -1) {
				System.exit(0);
			}
			
			if(input > 100) {
				obj1.close();
				throw new Exception("Number can’t be greater than 100");
			}
			
			else if(input %2 == 0) {
				System.out.println("You have entered an even number");
			}
			
			else {
				System.out.println("You have entered an odd number");
			}
			
		} 
		
		catch (InputMismatchException ex) {
			System.out.println("You must enter an integer.");
		} 
		
		catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		obj1.close();
	}

}
