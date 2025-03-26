package lesson1_3.repetitive_sentence.do_while_statement;

public class Main {

	public static void main(String[] args) {
		int i = 5;
		// 条件を満たしてなくても必ず1回は実行されることを説明
		do {
			System.out.println(i);
			++i;
		} while (i < 5);

	}

}
