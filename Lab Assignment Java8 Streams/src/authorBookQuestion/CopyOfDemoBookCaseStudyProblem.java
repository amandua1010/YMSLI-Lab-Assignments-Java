package authorBookQuestion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class CopyOfDemoBookCaseStudyProblem {

	public static void main(String[] args) {

		List<Book> allBooks = loadAllBooks();

//		1. Find books with more then 400 pages
		List<Book> booksHavingMoreThen400Pages = allBooks.stream()
												.filter(book -> book.getPages() > 400)
												.collect(Collectors.toList());
		
		
//		2. Find all books that are java books and more then 400 pages
		Predicate<Book> moreThan400Pgs = book-> book.getPages() > 400;
		Predicate<Book> booksJava = book-> book.getSubject() == Subject.JAVA;
		
		List<Book> moreThan400PgsAndJava = allBooks.stream()
										  .filter(moreThan400Pgs.and(booksJava))
										  .collect(Collectors.toList());
		
		
//		3. We need the top three longest books
//		Comparator<Book> bookComparator = (o1, o2) -> Integer.compare(o2.getPages(), o1.getPages());
		List<Book> top3LongestBook = allBooks.stream()
									.sorted(Comparator.comparing(Book :: getPages).reversed())
									.limit(3)
									.collect(Collectors.toList());

		
//		4. We need from the fourth to the last longest books
		List<Book> lastLongestBook = allBooks.stream()
									.sorted(Comparator.comparing(Book :: getPages).reversed())
									.skip(3)
									.collect(Collectors.toList());

				
//		5. We need to get all the publishing years
		List<Integer> list = allBooks.stream()
							.map(book-> book.getYear())
							.distinct()
							.collect(Collectors.toList());
		
		
//		6. We need all the authors names who have written a book

//		using "flatMap" to navigate from collection of book to author
	
		List<String> authorNames = allBooks
								  .stream()
								  .flatMap(book -> book.getAuthors().stream())
								  .map(a->a.getName())
								  .distinct()
								  .collect(Collectors.toList());
		
		
//		7. We need all the origin countries of the authors
		List<String> countryNames = allBooks
								   .stream()
								   .flatMap(book -> book.getAuthors().stream())
								   .map(name -> name.getCountry())
								   .distinct()
								   .collect(Collectors.toList());
		
		
//		8. We want the most recent published book.
		Optional<Book> optBook = allBooks.stream()
								.max(Comparator.comparing(Book :: getYear));
		
		
//		9. We want to know if all the books are written by more than one author
		if(allBooks.stream().allMatch(book -> book.getAuthors().size() > 1)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
//   	10. We want one of the books written by more than one author. (findAny)
		Optional<Book> booksWrittenByMoreThanOneAuthor = allBooks.stream()
														.filter(book -> book.getAuthors().size() > 1)
														.findAny();
		
		
//		11. We want the total number of pages published.
		Integer totalPagesPublished = allBooks.stream()
									 .map(book -> book.getPages())
									 .reduce(0, (p1, p2) -> p1 + p2);
		
	
//		12. We want to know how many pages the longest book has.
		Optional<Integer> pagesOfLongestBook = allBooks.stream()
											  .map(book -> book.getPages())
											  .reduce(Integer :: max);
		
	
//		13. We want the average number of pages of the books
		Double averageNoOfPages = allBooks.stream()
								 .collect(Collectors.averagingDouble(Book::getPages));
		
		
//		14. We want all the titles of the books
		List<String> bookTitles = allBooks.stream()
									 .map(book -> book.getTitle())
									 .collect(Collectors.toList());
		
	
//		15. We want the book with the higher number of authors?
		allBooks.stream()
		.collect(Collectors.maxBy(Comparator.comparing((Book book )-> book.getAuthors().size())));
	
//		16. We want a Map of book per year.
		Map<Integer, List<Book>> bookPerYearMap = allBooks.stream()
													   .collect(Collectors.groupingBy(Book::getYear));
		

//		17. We want to count how many books are published per year.
		Map<Integer, Long> booksPublishedPerYear = allBooks.stream()
												  .collect( Collectors.groupingBy( Book :: getYear, Collectors.counting() ) );
	

	}

	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors1 = Arrays.asList(new Author("raj", "gupta", "in"),
				new Author("ekta", "gupta", "in"));

		List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"));

		List<Author> authors3 = Arrays.asList(new Author("gunika", "gupta", "us"),
				new Author("keshav", "gupta", "us"));

		books.add(new Book("java", authors1, 400, Subject.JAVA, 2000, "1213"));
		books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
		books.add(new Book("Mgt", authors3, 600, Subject.DOT_NET, 2000, "1293"));

		return books;
	}

}
