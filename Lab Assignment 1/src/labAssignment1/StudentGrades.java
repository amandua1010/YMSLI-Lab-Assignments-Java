package labAssignment1;

import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) {
		int sum = 0;
		Scanner obj1 = new Scanner(System.in);
		
		System.out.println("Enter number of students: ");
		int n = obj1.nextInt();
		
		System.out.println("Enter the grades:");
		int [] grades = new int[1000];
		
		int count = 0;
		
		while(count < n){
		    int temp = obj1.nextInt();
		    
		    if(temp >= 0 && temp <= 100){
		    	grades[count] = temp;
		        sum += grades[count];
		        count++;
		        continue;
		    }
		    
		    System.out.println("Invalid grade, try again");
		}
		
		System.out.println("The average is: " + (float)sum/n);
		
		obj1.close();
	}

}
