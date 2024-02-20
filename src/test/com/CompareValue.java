package test.com;

 // Write a program to Compare the strings using equals(), compareTo() and == operator

 
public class CompareValue {
	String name; 
	String name2;

	 CompareValue(String name , String name2){
		 this.name = name;
			this.name2 = name2;
	 }
	 
	 void equal() {
		 
		System.out.println(" "+name.equals(name2));
		 System.out.println(""+name.compareTo(name2));
		 System.out.println(" "+(name == name2));
	 }
	 
	 
	public static void main(String[] args) {
		CompareValue run = new CompareValue("daman","daman");
		run.equal();

	}

}
