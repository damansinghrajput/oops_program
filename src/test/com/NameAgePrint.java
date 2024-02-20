package test.com;

public class NameAgePrint {

	private String name;

	private int age;

	String getname() {

		return name;

	}

	void setname(String name) {

		this.name = name;
	}

	int getage() {

		return age;

	}

	void setage(int age) {

		this.age = age;
	}

	public static void main(String[] args) {
		NameAgePrint nameage = new NameAgePrint();
		nameage.setname("Daman Singh Rajput");
		nameage.setage(21);

		System.out.println("Full Name :" + nameage.getname());
		System.out.println("Age :" + nameage.getage());

	}

}
