package question1;

import java.io.IOException;
import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ReadByteFormat {

	public static void main(String[] args) {
		
		try {
			
			File demoFilePath = new File("C:\\Users\\ve00ym263\\Documents\\workspace-spring-tool-suite-4-4.4.2.RELEASE\\Lab Assignment 4\\src\\question1\\DemoFile.txt");
			
			InputStream demoFile = new FileInputStream(demoFilePath);
			
			byte[] bytesArray = new byte[(int) demoFilePath.length()];
			
			demoFile.read(bytesArray);
			String fileData = new String(bytesArray);
			System.out.println("The Demo File contains: " + fileData);
			demoFile.close();
			
		} 
		
		catch (FileNotFoundException ex) {
			System.out.println("Sorry! File not present.");
			ex.printStackTrace();
		} 
		
		catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}

}
