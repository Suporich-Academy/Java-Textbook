package lesson1_3.method.practice;

public class Main {

	public static void main(String[] args) {
		System.out.println(checkParity(2));
		// ⇒even
		System.out.println(checkParity(3));
		// ⇒odd
	}

	static String checkParity(int num) {
		if (num % 2 == 0) {
			return "even";
		} else {
			return "odd";
		}
	}

}
