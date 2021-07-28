package labAssignment1;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner obj1 = new Scanner(System.in);
		
		System.out.println("Enter number of elements you want in the pattern:");
		int n = obj1.nextInt();
		
		for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
		obj1.close();
	}

}
