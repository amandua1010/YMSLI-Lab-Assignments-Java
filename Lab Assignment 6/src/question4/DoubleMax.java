package question4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DoubleMax {

	public static void main(String[] args) {
		
		File dataFilePath = new File("C:\\Users\\ve00ym263\\Documents\\workspace-spring-tool-suite-4-4.4.2.RELEASE\\Lab Assignment 6\\src\\question4\\dataFile.txt");

		
		try {
			
			Scanner obj1 = new Scanner(dataFilePath);
			double result = -1.0;
			
			while(obj1.hasNextDouble()) {
				double temp = obj1.nextDouble();
				if(result < temp) {
					result = temp;
				}
			}
			
			System.out.println(result);
			
			obj1.close();
			
		}
		
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
	}

}
