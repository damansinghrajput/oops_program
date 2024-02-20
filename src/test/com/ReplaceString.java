package test.com;

// Write a program to Replace string with another string in java using String.replace() method

public class ReplaceString {
	
	String name; 
	String name2;
	
	ReplaceString(String name , String name2){
		
		this.name = name;
		this.name2 = name2;
	}

	
	void replace() {
	 String name1 = name.replace(name, name2);
	System.out.println(name1);	
		
	}
	
	public static void main(String[] args) {
		
		ReplaceString run = new ReplaceString("daman","aman");
		run.replace();
	}

}
