package question2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {

	public static void main(String[] args) {
	
		try {
			
			String demoFilePath = "C:\\Users\\ve00ym263\\Documents\\workspace-spring-tool-suite-4-4.4.2.RELEASE\\Strings IO Formatting and Parsing Quest\\src\\question2\\DemoFile.txt";
			
			BufferedReader br = new BufferedReader(new FileReader( demoFilePath ));
			int lineNum = 0;
			String line = br.readLine();;
			lineNum++;
			
			while(line != null) {
				System.out.println(lineNum + "- " + line);
				
				line = br.readLine();
				lineNum++;
			}
			
			br.close();
			
		} 
		
		catch (FileNotFoundException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
