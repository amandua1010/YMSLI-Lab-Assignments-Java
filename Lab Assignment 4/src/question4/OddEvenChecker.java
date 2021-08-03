package question4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddEvenChecker {

	public static void main(String[] args) {
		
		Scanner obj1 = new Scanner(System.in);
				
		try {
			
			System.out.println("Please enter a number or enter ‘-1’ if you want to quit: ");
			int input = obj1.nextInt();
			
			if(input == -1) {
				System.exit(0);
			}
			
			else if(input %2 == 0) {
				System.out.println("You have entered an even number");
			}
			
			else {
				System.out.println("You have entered an odd number");
			}
			
		} 
		
		catch (InputMismatchException e) {
			System.out.println("You must enter an integer.");
		}
		
		obj1.close();
	}

}
