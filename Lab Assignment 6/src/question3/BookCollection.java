package question3;

import java.util.*;

class Book implements Comparable<Book> {
	
	private String bookTitle;
	private String bookAuthor;
	
	Book(String bookTitle, String bookAuthor){
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	
	 @Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [bookTitle=");
		builder.append(bookTitle);
		builder.append(", bookAuthor=");
		builder.append(bookAuthor);
		builder.append("]");
		return builder.toString();
	}

	@Override
	 public int compareTo(Book book) {
	       return this.getBookTitle().compareTo(book.getBookTitle());
	 }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookAuthor == null) ? 0 : bookAuthor.hashCode());
		result = prime * result + ((bookTitle == null) ? 0 : bookTitle.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookAuthor == null) {
			if (other.bookAuthor != null)
				return false;
		} else if (!bookAuthor.equals(other.bookAuthor))
			return false;
		if (bookTitle == null) {
			if (other.bookTitle != null)
				return false;
		} else if (!bookTitle.equals(other.bookTitle))
			return false;
		return true;
	}
	 
}

class TempBookCollection {
	
	private String bookOwnerName;
	private HashSet<Book> ownerBookSet;
	
	TempBookCollection(String bookOwnerName, HashSet<Book> ownerBookSet){
		this.bookOwnerName = bookOwnerName;
		this.ownerBookSet = ownerBookSet;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TempBookCollection [bookOwnerName=");
		builder.append(bookOwnerName);
		builder.append(", ownerBookSet=");
		builder.append(ownerBookSet);
		builder.append("]");
		return builder.toString();
	}

	public void hasBook(Book b) {
		if( ownerBookSet.contains(b) ) {
			System.out.println("Requested Book" + b.getBookTitle()+ "is present.");
		}
		else {
			System.out.println("Requested Book " + b.getBookTitle()+ " is not present.");
		}
	}
	
	public void sortBookSet() {
		
		List<Book> booksList = new ArrayList<Book>();
		
		for (Book book1 : ownerBookSet)
			booksList.add(book1);
		
		Collections.sort(booksList);
		System.out.println();
		for (Book book2 : booksList) {
			System.out.println("Title of the Book is: " + book2.getBookTitle() + " and The author of the Book is: " + book2.getBookAuthor());
		}
		
	}
	
}


public class BookCollection {

	public static void main(String[] args) {
		
		HashSet<Book> booksCollection = new HashSet<>();
		
		booksCollection.add(new Book("C++ programming", "Author 1"));
		booksCollection.add(new Book("OOPS Concepts", "Author 2"));
		booksCollection.add(new Book("Design Patterns", "Author 3"));
		booksCollection.add(new Book("Entertainment Novel", "Author 4"));
		booksCollection.add(new Book("Book on Sprituality", "Author 5"));
		
		booksCollection.add(new Book("Java in depth", "Author 6"));
		
		TempBookCollection bookCollection = new TempBookCollection("Aman Dua Books Set", booksCollection);
		bookCollection.hasBook(new Book("Java in depth", "Author 6"));
		
		System.out.println(bookCollection);
		
		bookCollection.sortBookSet();
		
	}

}
