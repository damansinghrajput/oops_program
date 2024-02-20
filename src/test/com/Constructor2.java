package test.com;



//constructor means is  arguments run with object starts in first , exp -
public class Constructor2 {

	int num1;
	int num2;

	int getnumber1() {
		return num1;
	}

	int getnumber2() {
		return num2;
	}

	void setnum(int num1) {
		this.num1 = num1;
	}

	void setnum2(int num2) {
		this.num2 = num2;
	}

	Constructor2(int num1, int num2) {

		this.num1 = num1;
		this.num2 = num2;
	}

	int add() {
		int sum = num1 + num2;
		return sum;

	}

	int mutiple() {

		int sum = num1 * num2;
		return sum;
	}

	void doublevalue() {

		this.num1 = num1 * 2;
		this.num2 = num2 * 2;
	}

	public static void main(String[] args) {
		Constructor2 ad = new Constructor2(2, 3);

		System.out.println("Additional " + ad.add());
		System.out.println("Mutiple " + ad.mutiple());

		System.out.println("Mutiple " + ad.getnumber1());

	}

}
