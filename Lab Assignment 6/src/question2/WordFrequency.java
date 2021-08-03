package question2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class WordFrequency {

	public static void main(String[] args) {
		
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		try {			
			
			String fileStoryPath = "C:\\Users\\ve00ym263\\Documents\\workspace-spring-tool-suite-4-4.4.2.RELEASE\\Lab Assignment 6\\src\\question2\\file story.txt";
			BufferedReader text = new BufferedReader(new FileReader(fileStoryPath));
			
			String temp = null;
			
			while( (temp = text.readLine()) != null ) {
				
				String wordsArray[] = temp.split(" ");
				
				for(int counter = 0; counter < wordsArray.length; counter++) {
					
					if( h1.containsKey(wordsArray[counter]) ) {
						h1.put( wordsArray[counter], h1.get(wordsArray[counter]) + 1 );
					}
					
					else {
						h1.put(wordsArray[counter], 1);
					}
					
				}
				
			}
			
			text.close();
			
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Set<Entry<String, Integer>> set = h1.entrySet();
		for (Entry<String, Integer> entry : set) {
			System.out.println("Word- " + entry.getKey() + " appears " + entry.getValue() + " times.");
		}
		
	}

}
