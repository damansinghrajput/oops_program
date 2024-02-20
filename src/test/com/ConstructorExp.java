package test.com;

public class ConstructorExp {
	
	 private String name;                                                      ////  Constructor Example
	   private String surname;
	
	
	ConstructorExp(String name , String name2){
		this.name= name;                  //   setter
		this. surname =name2;
		
	}
	
	void fullName() {
	
		String full = name + surname;   // getter
		System.out.println(full);
		
	}

	public static void main(String[] args) {
		
		
		
		ConstructorExp namep = new ConstructorExp("Daman", "Rajput");
		namep.fullName();

		
		
	}

}
