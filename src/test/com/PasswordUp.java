package test.com;

public class PasswordUp {

	private int pin;

	int getpin() { //// first is getter then is setter
		return pin;

	}
	
	
	// getter - return the value
	// setter - set / update value
	
	

	void setpin(int pin) {

		this.pin = pin;

	}

	void updatepin(int add) {
		this.pin = this.pin + add;

	}

	public static void main(String[] args) {

		PasswordUp atm = new PasswordUp();
		atm.setpin(1235);
		atm.updatepin(100);
		System.out.println(" Password : " + atm.getpin());

	}

}
