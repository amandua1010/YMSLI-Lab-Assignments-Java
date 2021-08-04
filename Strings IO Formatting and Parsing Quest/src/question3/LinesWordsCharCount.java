package question3;

import java.util.Scanner;

public class LinesWordsCharCount {

	public static void main(String[] args) {
		
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Input the Text: ");
		
		String inputText = obj1.nextLine();
		
		int numChar = 0, numWords = 1, numLines = 0;
		
		for(int count=0; count<inputText.length(); count++) {
			if(inputText.charAt(count) != ' ') {
				numChar++;
			}
			
			if(inputText.charAt(count) == ' ') {
				numWords++;
			}
		}
		
		System.out.println("Number of characters in the input text is: " + numChar);
		System.out.println("Number of words in the input text is: " + numWords);
		System.out.println("Number of lines in the input text is: " + numLines);
		
		obj1.close();
		
	}

}
