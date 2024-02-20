package test.com;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalAge {
 
	

	public class DateCalculator
	
	{
	    public static void main(String[] args) {
	        // Get input for the previous year, days, and months
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter previous year: ");
	        int prevYear = scanner.nextInt();

	        System.out.print("Enter months ago: ");
	        int monthsAgo = scanner.nextInt();

	        System.out.print("Enter days ago: ");
	        int daysAgo = scanner.nextInt();

	        // Get the current date
	        LocalDate currentDate = LocalDate.now();

	        // Subtract months and days
	        LocalDate calculatedDate = currentDate.minusMonths(monthsAgo).minusDays(daysAgo);

	        // Set the previous year
	        calculatedDate = calculatedDate.withYear(prevYear);

	        // Print the result
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        System.out.println("Current date: " + currentDate.format(formatter));
	        System.out.println("Calculated date: " + calculatedDate.format(formatter));

	        // Close the scanner
	        scanner.close();
	    }
	}

	}


