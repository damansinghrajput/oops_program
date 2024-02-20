package test.com;
import java.util.Scanner;


public class AnvvieryWish {

	
	int year(  int year) {
		int sum = 2024 - year;
		return sum;
	}
	
	
	

	
	    public static void main(String[] args) {
	    	 System.out.print("Welcome to Techxplore : ");
	    	
	    	 
	    	 
	        Scanner scanner = new Scanner(System.in);
	        AnvvieryWish daman= new AnvvieryWish();
	        
	        System.out.println();
	        
	        System.out.println("------------------------");
	        // Taking input for names
	        System.out.print("Enter your name: ");
	        String yourName = scanner.nextLine();

	        System.out.print("Enter your partner's name: ");
	        String partnerName = scanner.nextLine();

	        // Taking input for years
	        System.out.print("Enter the Marriage years : ");
	       /// String th = scanner.nextLine();
	        int years = scanner.nextInt();
	       int dan = daman.year(years);
	     
	        System.out.println();
	        
	        System.out.println("------------------------");
	        // Displaying the anniversary wish
	        System.out.println("\nCongratulations, " + yourName + " and " + partnerName + " For Happy Anniversary !");
	        System.out.println("Happy " + dan + "-year Anniversary!");
	        System.out.println("May your love continue to grow stronger.");
	        
	        System.out.println();
	        
	        System.out.println("------------------------");

	        // Close the scanner
	        scanner.close();
	    }
	}
