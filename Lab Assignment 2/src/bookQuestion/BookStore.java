package bookQuestion;
import java.util.*;

public class BookStore {
	
	private int currentSize = 0;
	private Book books[];
	private final int size = 10;

	public BookStore() {
		books = new Book[size];
	}

	public void sell(String bookTitle, int numOfCopies) {

		int temp = 0;  // taking care of the index of the book
		boolean bookFound = false;

		for (Book book : books) {

			if (book == null) {
				break;
			}

			if (book.getBookTitle().equals(bookTitle)) {

				bookFound = true;
				int count = book.getNumberOfCopies();   //Present copies

				if (count > numOfCopies) {
					
					book.setNumberOfCopies(count - numOfCopies);
					System.out.println("Sell Order Issued");
					
				} 
				
				else if (count == numOfCopies) {
					
					while (temp < currentSize) {
						
						books[temp] = books[temp + 1];
						temp++;
						
					}

					books[currentSize - 1] = null;
					currentSize--;
					
					System.out.println("Sell Order Issued");
				} 
				
				else {
					System.out.println("Copies of books not available");
				}
				
				break;
			}
		}

		if (bookFound == false) {
			System.out.println("The Book is not found in the books store array");
		}
		
		temp++;
	}

	public void order(String ISBN, int numOfCopies) {

		boolean bookFound = false;

		for (Book book : books) {

			if (book == null) {
				break;
			}

			if (book.getISBN().equals(ISBN)) {
				
				bookFound = true;
				int copiesAvailable = book.getNumberOfCopies();
				book.setNumberOfCopies( copiesAvailable + numOfCopies );
				System.out.println("Order Successfully Placed");
				break;
				
			}
		}

		if (!bookFound) {
			Scanner obj1 = new Scanner(System.in);

			System.out.println("Placing a new order");

			System.out.println("Enter Book Title");
			String bookTitle = obj1.next();

			System.out.println("Enter Author");
			String bookAuthor = obj1.next();

			if (currentSize <= size) {
				
				books[currentSize] = new Book(bookTitle, bookAuthor, ISBN, numOfCopies);
				System.out.println("New Book Added");
				currentSize++;
				
			}
			
			else {
				System.out.println("Book Store is Full");
			}
			
			obj1.close();
		}

	}

	public void display() {

		if (currentSize == 0) {
			
			System.out.println();
			System.out.println("Book Store is Empty");
			System.out.println();
			return;
			
		}

		for (Book book : books) {
			if (book != null)
				book.display();
		}
	}
	
}
