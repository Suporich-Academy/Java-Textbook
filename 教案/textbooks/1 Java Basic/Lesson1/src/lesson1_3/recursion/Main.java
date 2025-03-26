package lesson1_3.recursion;

public class Main {

	public static void main(String[] args) {
		for (int n = 0; n <= 5; n++) {
			System.out.println(n + "までの和=" + f(n));
		}
	}

	static int f(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n + f(n - 1);
		}
	}

}
