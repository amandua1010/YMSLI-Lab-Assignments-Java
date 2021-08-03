package question6;

import java.util.InputMismatchException;
import java.util.Scanner;

class InputException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InputException(int input) {
		super("Number can’t be greater than " + input);
	}

}

public class EvenOddCustomException {

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
				throw new InputException(100);
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
		
		catch (InputException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
		catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		obj1.close();
		
	}

}
