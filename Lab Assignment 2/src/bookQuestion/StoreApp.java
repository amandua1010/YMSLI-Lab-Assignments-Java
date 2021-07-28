package bookQuestion;
import java.util.Scanner;

public class StoreApp {

	public static void placeOrder(BookStore bookStore, Scanner obj1) {
		
		System.out.println("Enter ISBN Code and Number of Copy of Books");
		String str = obj1.next();
		
		String isbn = str.split("_")[0];
		int numOfCopies = Integer.parseInt(str.split("_")[1]);
		
		bookStore.order(isbn, numOfCopies);
		
	}

	public static void sellOrder(BookStore bookStore, Scanner obj1) {
		
		System.out.println("Enter ISBN Code and Number of Copy of Books");
		String str = obj1.next();
		
		String bookTitle=str.split("_")[0];
		int numOfCopies =Integer.parseInt(str.split("_")[1]);

		bookStore.sell(bookTitle, numOfCopies);
		
	}
	
	public static void main(String[] args) {
		Scanner obj1 = new Scanner(System.in);

		BookStore bookStore1 = new BookStore();

		System.out.println("Book Store App Welcomes You...");

		int n;
		do {
			System.out.println("Enter “1”, to display the Books: Title – Author – ISBN - Quantity");
			System.out.println("Enter “2”, to order new books.");
			System.out.println("Enter “3”, to sell books");
			System.out.println("Enter “0”, to exit the system.");
			n = obj1.nextInt();

			if (n == 1) {
				bookStore1.display();
			} 
			
			else if (n == 2) {
				placeOrder(bookStore1, obj1);
			} 
			
			else if (n == 3) {
				sellOrder(bookStore1, obj1);
			}
			
			else {
				System.out.println("Wrong Input !!! ,Re-Enter : ");
				continue;
			}

		} 
		while (n != 0);
	}

}
