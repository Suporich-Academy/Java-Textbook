package lesson1_3.repetitive_sentence.for_statement.ex1;

public class Main {

	public static void main(String[] args) {
		// 0,1,2,3,4を表示させる
		// 初期値i：0
		// 繰り返し条件i<5
		// 繰り返し時処理:1ずつ増える
		for (int i = 0; i < 5; i++) {
			System.out.println("iの値は" + i);
		}
		System.out.println("-----------------------------");
		// 2,4,6,8を表示させる
		for (int i = 2; i < 9; i += 2) {
			System.out.println("iの値は" + i);
		}
	}

}
