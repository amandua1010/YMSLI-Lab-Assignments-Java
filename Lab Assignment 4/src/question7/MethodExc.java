package question7;

import java.io.IOException;
import java.util.Scanner;

class InputException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InputException() {
		super("Input Exception has occured here as x not equal to y.");
	}
	
}

public class MethodExc {
	
	public static void throwException(int x, int y) throws IOException,InputException{
		
		if(x == y) {
			throw new IOException();
		}
		
		else {
			throw new InputException();
		}
		
	}

	public static void main(String[] args) {
		
		Scanner obj1 = new Scanner(System.in);
		int x, y;
		System.out.println("Input the value of x: ");
		x = obj1.nextInt();

		System.out.println("Input the value of y: ");
		y = obj1.nextInt();
		
		try {
			throwException(x, y);
		}
		
		catch (InputException e) {
			// TODO Auto-generated catch block
			System.out.println("Input Exception");
			e.printStackTrace();
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IO Exception");
			e.printStackTrace();
		}

		obj1.close();
		
	}

}
