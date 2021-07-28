package studentQuestion;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
	
		Scanner obj1 = new Scanner(System.in);
		
		System.out.println("Enter the Name of the Student: "); 
		String studentName = obj1.nextLine();
		
		System.out.println("Enter the ID of the Student: ");
		String studentID = obj1.nextLine();
		
		System.out.println("Enter the Grade of the Student: "); 
		int studentGrade = obj1.nextInt();
		
		System.out.println("Enter the Year of the Student: "); 
		int studentYear = obj1.nextInt();
		
		Student s = new Student(studentName, studentID, studentGrade);
		
		System.out.println("Student details are as follows: ");
		
		s.display(studentYear);
		
		obj1.close();
		
	}
	
}
