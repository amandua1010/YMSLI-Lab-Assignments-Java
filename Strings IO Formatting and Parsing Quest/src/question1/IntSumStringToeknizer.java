package question1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IntSumStringToeknizer {

	public static void main(String[] args) {
		
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Input the sequence of Integers: ");
		
		String input = obj1.nextLine();
		StringTokenizer stringToken = new StringTokenizer(input, " ");
		
		System.out.println();
		System.out.println("Integers input are: ");
		
		int result = 0, temp;
		
		while(stringToken.hasMoreTokens()) {
			
			String eachInteger = stringToken.nextToken();
			temp = Integer.parseInt(eachInteger);
			
			System.out.println(temp);
			result += temp;
			
		}
		
		System.out.println("Total sum of all input integers is: " + result);
		
		obj1.close();
		
	}

}
