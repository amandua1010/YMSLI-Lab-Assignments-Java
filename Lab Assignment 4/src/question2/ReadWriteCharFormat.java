package question2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
//import java.io.*;

public class ReadWriteCharFormat {

	public static void main(String[] args) {
		
		String demoFilePath = "C:\\Users\\ve00ym263\\Documents\\workspace-spring-tool-suite-4-4.4.2.RELEASE\\Lab Assignment 4\\src\\question2\\DemoFileChar.txt";
		File demoFile = new File(demoFilePath);
		
		// Writing in file
		try ( BufferedReader readText = new BufferedReader(new InputStreamReader(System.in)); BufferedWriter writer = new BufferedWriter( new FileWriter(demoFile)) ) {
			
			System.out.println("Input the text for the file: ");
			String input = readText.readLine();
			writer.write(input);
		
		} 
		
		catch (IOException ex) {
			System.out.println("Exception occured");
			ex.printStackTrace();
		}
		
		System.out.println("Writing in file completed.");

		System.out.println();
		
		// Now Reading from File
		System.out.println("Now reading from the Demo File: ");
		try (BufferedReader fileText = new BufferedReader(new FileReader(demoFile));) {
			
			String text = fileText.readLine();
			
			while (text != null) {
				System.out.println(text);
				text = fileText.readLine();
			}
			
		} 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
