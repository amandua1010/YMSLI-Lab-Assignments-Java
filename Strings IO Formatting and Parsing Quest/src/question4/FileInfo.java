package question4;

import java.io.File;
import java.util.Scanner;

public class FileInfo {

	public static void main(String[] args) {
		
		Scanner obj1 = new Scanner(System.in);
		int flag = 0;
		
		String firstHalfFileName = "C:\\Users\\ve00ym263\\Documents\\workspace-spring-tool-suite-4-4.4.2.RELEASE\\Strings IO Formatting and Parsing Quest\\src\\question4\\";
		String secondHalfFileName;
		
		String filePath; 
		System.out.println("Input the File Name with File extension: ");
		secondHalfFileName = obj1.nextLine();
		
		filePath = firstHalfFileName + secondHalfFileName;
		
		File file = new File(filePath);
		
		if(file.exists()) {
			flag = 1;
			System.out.println("Input File exists.");
		}
		else {
			System.out.println("Input File does not exists.");
		}
		
		if(flag == 1) {
			
			if(file.canRead()) {
				System.out.println("Input File is readable."); 
			}
			else {
				System.out.println("Input File is not readable.");
			}
			
			if(file.canWrite()) {
				System.out.println("Input File is writable."); 
			}
			else {
				System.out.println("Input File is not writable.");
			}
			
			System.out.println("Input File type is: " + file.getName());
			System.out.println("Length of the Inpur File in bytes is: ." + file.length());
		
		}
		
	}

}
