package question6;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateQuest {

	public static void main(String[] args) {
		
		Scanner obj1 = new Scanner(System.in);
		int day, month, year;
		
		System.out.println("Input the Day: ");
		day = obj1.nextInt();
		
		System.out.println("Input the Month: ");
		month = obj1.nextInt();
		
		System.out.println("Input the Year: ");
		year = obj1.nextInt();
		
        LocalDate inputDate = LocalDate.of(year, month, day); 
  
        LocalDate currentDate = LocalDate.of(2021, 8, 4);
       
        Period duration = Period.between(inputDate, currentDate);

        System.out.print("Duration between today and input date is: " + duration.getYears() + " Years, " + duration.getMonths() + " Months, " + duration.getDays() + " Days");
        
        obj1.close();
		
	}

}
