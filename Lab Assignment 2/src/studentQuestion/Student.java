package studentQuestion;

public class Student {
	
	private String studentName;
	private String studentID;
	private int studentGrade;
	
	public Student(String studentName, String studentID, int studentGrade) {
		this(studentName, studentID);
		this.studentGrade = studentGrade;
	}
	
	public Student(String studentName, String studentID) {
		this(studentID);
		this.studentName = studentName;
	}

	public Student(String studentID) {
		this.studentID = studentID;
	}


	public void display() {
		System.out.println("Name of the Student is: " + this.studentName);
		System.out.println("ID of the Student is: " + this.studentID);
		System.out.println("Grade of the Student is: " + this.studentGrade);
	}
	
	public void display(int studentYear) {
		display();
		System.out.println("Year of the Student is: " + studentYear);

	}
	
}
