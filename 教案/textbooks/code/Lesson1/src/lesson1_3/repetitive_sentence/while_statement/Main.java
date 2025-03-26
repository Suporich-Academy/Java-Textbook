package lesson1_3.repetitive_sentence.while_statement;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		while (i < 5) {
			System.out.println("iの値は" + i);
			i++;
		}

		// エラー発生
		/*
		 * while(false) { System.out.println("Hello"); }
		 */

	}

}
