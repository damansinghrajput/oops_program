package test.com;

import java.math.BigDecimal;

// total amt = principal + principal * interest * years
public class BigDecimalCal {
	
	BigDecimal principal;
	
	BigDecimal interest;
	 
	
	BigDecimalCal(String principal, String interest){
		this.principal = new BigDecimal( principal);     /// setter constructor
		this. interest = new BigDecimal( interest);
		
	}
	
	BigDecimal GetcalTotal(int years) {
		
		BigDecimal numYear = new BigDecimal(years);
		                                                                                        //   getter 
		BigDecimal sumTotal = principal.add(principal.multiply(interest).multiply(numYear));   //// formula
		 
		return sumTotal;         //  return value
		
		
	}
	

	public static void main(String[] args) {
		
		BigDecimalCal cal = new BigDecimalCal("4500.00","7.5");
		BigDecimal sumTotal = cal.GetcalTotal(5);                 // Calling method 
		System.out.println(sumTotal);
	}
	
}
