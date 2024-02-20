package test.com;

public class BookCopies{

   private int copies;                                     //// instance variable

	int getCopies() {
		
		
		return this.copies; // return type method

		// System.out.println(copies);
		/// System.out.println(this.copies);

	}

	void bookGetCopies(int copies) {                            // local variable
		this.copies = copies;                                //// no-return type this is method

		//System.out.println(copies);
		// System.out.println(this.copies);

	}
	
	void AddCopies(int add) {
		
		this.copies = this.copies + add ;
	}
	
		
	void SubCopies(int sub) {
	this.copies = this.copies - sub ;
	}
	
	
	
	
	public static void main(String[] args) {
		BookCopies java = new BookCopies();
		BookCopies javaBooks1 = new BookCopies();                   /// Creating object
		BookCopies javaBooks2 = new BookCopies();

		java.bookGetCopies(10);
		javaBooks1.bookGetCopies(20);                                        // call method with object name input int value
		javaBooks2.bookGetCopies(30);
		
		 ///  next topice  of encapsulation add value in int value
		
		//int addCopies = java.getCopies();
		//addCopies = addCopies + 100;           //   10+100;   java.AddCopies(100);
		///java.bookGetCopies(addCopies);
		
		java.AddCopies(10);
		javaBooks1. SubCopies(10);
		
		

		System.out.println(" Total Java Books Copies " + java.getCopies());
		System.out.println(" Total Python Books Copies " + javaBooks1.getCopies());                  // value printed with method name
		System.out.println(" Total JavaScript Books Copies " + javaBooks2.getCopies());
	}

}
