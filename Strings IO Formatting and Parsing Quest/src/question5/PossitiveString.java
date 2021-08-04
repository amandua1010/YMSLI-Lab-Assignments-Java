package question5;

import java.util.Arrays;
import java.util.Scanner;

public class PossitiveString {

	public static void main(String[] args) {
		
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Input the String: ");
		int flag = 1;
		
		String inputString = obj1.nextLine();
		
		int stringLength = inputString.length();
		
		char [] charArray = new char[stringLength] ;
		
		for(int count=0; count<stringLength; count++) {
			charArray[count] = inputString.charAt(count);
		}
		
		Arrays.sort(charArray);
		
		for(int count=0; count<stringLength; count++) {
			if(charArray[count] != inputString.charAt(count)) {
				flag = 0;
			}
		}
		
		if(flag == 0) {
			System.out.println("Flase");
		}
		else {
			System.out.println("True");
		}
		
		obj1.close();
		
	}

}
