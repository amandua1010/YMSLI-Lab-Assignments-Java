package stringPractice;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringQuestions {
	
	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		

//		1. Count the empty strings
		long emptyStringsCount = strList.stream()
								.filter(str -> str.length() == 0)
								.count();
		System.out.println(emptyStringsCount);
		

//		2. Count String with length more than 3 
		List<String> stringWithLengthMoreThanThree = strList.stream()
													.filter(str -> str.length() > 3)
													.collect(Collectors.toList());
		stringWithLengthMoreThanThree.forEach(x -> System.out.println(x));
		

//		3. Count number of String which startswith "a" 
		Predicate<String> validString = str -> str.length() > 0;
		Predicate<String> stringStartingWithA = str -> str.charAt(0) == 'a';
 		long result = strList.stream()
 					 .filter( validString.and(stringStartingWithA) )
 					 .count();
		System.out.println(result);
		

//		4. Remove all empty Strings from List
		List<String> nonEmptyStrings = strList.stream()
									  .filter(validString)
									  .collect(Collectors.toList());
		nonEmptyStrings.forEach(str -> System.out.println(str));
	
	
//		5. Create a String  more than 2 characters (joining)
		String stringWithMoreThanTwoChar = strList.stream()
										  .filter(str -> str.length() > 2)
										  .collect(Collectors.joining(" "));
		System.out.println(stringWithMoreThanTwoChar);
		

//		6. Convert String to Uppercase and join them using coma 
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada"); 
		String upperCaseCountries = G7.stream()
						  .map(str -> str.toUpperCase())
						  .collect(Collectors.joining(","));
		System.out.println(upperCaseCountries);
		

//		7. Create List of square of all distinct numbers 
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4); 
		List<Integer> squareOfNumbers = numbers.stream()
									   .map(x -> x * x)
									   .collect(Collectors.toList());
		System.out.println(squareOfNumbers);
		

//		 8. Get count, min, max, sum, and average for numbers
		 List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29); 

				 
		IntSummaryStatistics stats = primes.stream()
									.mapToInt(x -> x)
									.summaryStatistics();
		System.out.println("Highest prime number in List : " + stats.getMax()); 
		System.out.println("Lowest prime number in List : " + stats.getMin()); 
		System.out.println("Sum of all prime numbers : " + stats.getSum()); 
		System.out.println("Average of all prime numbers : " + stats.getAverage());
		
	}
	
}
