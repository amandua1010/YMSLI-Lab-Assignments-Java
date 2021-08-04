package question7;

import java.util.Scanner;

class JobSeeker{
	private String name;
	private String userName;
	
	public JobSeeker(String name, String userName) {
		this.name = name;
		this.userName = userName;
	}
	
	boolean check(String userName) {
		int userNameLength = userName.length() ;
		
		String leftString = userName.substring(0, userNameLength - 4);
		int lengthLeftString = leftString.length() ;
//		System.out.println(lengthLeftString);
		
		String endUserName = userName.substring(userNameLength - 4, userNameLength);
//		System.out.println(endUserName);
		
		if(lengthLeftString < 8 && endUserName != "_job") {
			return false;
		}
		
		return true;
	}
	
}

public class JobSeekerApp {

	public static void main(String[] args) {
		
		Scanner obj1 = new Scanner(System.in);
		
		String name, userName;
		
		System.out.println("Input your Name: ");
		name = obj1.nextLine();
		
		System.out.println("Input your User Name: ");
		userName = obj1.nextLine();
		
		JobSeeker seeker = new JobSeeker(name, userName);
		
		if( seeker.check(userName) ) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		obj1.close();
		
	}

}
