package bookQuestion;

public class Book {
	
	private String bookTitle;
	private String author;
	private String ISBN;
	private int numOfCopies;
	
	public String getBookTitle() {
		return bookTitle;
	}
	
	public int getNumberOfCopies() {
		return numOfCopies;
	}
	
	public void setNumberOfCopies(int numOfCopies) {
		this.numOfCopies=numOfCopies;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public Book(String bookTitle, String author, String ISBN, int numOfCopies) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.ISBN = ISBN;
		this.numOfCopies = numOfCopies;
	}
	
	public void display() {
		
		System.out.println("Book Title: " + bookTitle);
		System.out.println("Book Author: " + author);
		System.out.println("Book ISBN: " + ISBN);
		System.out.println("Number of Books: " + numOfCopies);
		
	}
	
}
