package lesson1_3.repetitive_sentence.for_each_statement;

public class Main {

	public static void main(String[] args) {
		// 1次元配列
		int[] array = { 20, 30, 40, 50 };
		// 拡張for分
		for (int a : array) {
			System.out.println(a);
			// ⇒20,30,40,50
		}

		// 2次元配列
		int[][] array2D = { { 22, 33 }, { 44, 55, 66 } };
		// 2次元配列内の各列に対して繰り返し処理を行う
		for (int[] column : array2D) {
			// 現在の列内の各要素に対して繰り返し処理を行う
			for (int row : column) {
				// 2次元配列内の現在の要素の値を表示する
				System.out.println(row);
			}
		} // ⇒22,33,44,55,66

	}

}
