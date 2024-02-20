package test.com;
import java.math.BigDecimal;

public class BigDecimalNumber {

	public static void main(String[] args) {
		
		
		BigDecimal bd1 = new BigDecimal(124567890.0987654321); 
	        BigDecimal bd2 =  new BigDecimal(987654321.123456789); 
	      
	        
	        
	        bd1 = bd1.add(bd2); 
	        System.out.println("BigDecimal1 = " + bd1); 
	}
	
	

}
