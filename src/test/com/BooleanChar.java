package test.com;

public class BooleanChar {
	char ch;

	BooleanChar(char ch) {

		this.ch = ch;
	}

	boolean isVowel() {

		if (ch == 'a' || ch == 'A' || ch == 'i' || ch == 'I' || ch == 'e' || ch == 'E' || ch == 'o' && ch == 'O'
				|| ch == 'u' || ch == 'U')
			return true;

		return false;

	}

	boolean isNumber() {

		if (ch >= 48 && ch <= 57)
			return true;

		return false;
	}

	boolean isAlphabet() {

		if (ch >= 97 && ch <= 122 || ch >= 65 && ch <= 90)
			return true;

		return false;

	}

	boolean isConsonant() {

		if (isAlphabet() && !isVowel()) //// logical not ! uses
			return true;

		return false;
	}

	void loweCaseAlp() {
		for ( ch ='a'; ch <= 'z' ; ch++ ) {
			System.out.println(ch);
		}
	}
	
	
	public static void main(String[] args) {
		BooleanChar mychar = new BooleanChar('B');
		System.out.println(mychar.isVowel());
		System.out.println(mychar.isNumber());
		System.out.println(mychar.isAlphabet());
		System.out.println(mychar.isConsonant());
		
		mychar.loweCaseAlp();
		 
	}


	
	

}
