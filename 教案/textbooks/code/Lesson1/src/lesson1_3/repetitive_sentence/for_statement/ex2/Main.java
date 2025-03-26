package lesson1_3.repetitive_sentence.for_statement.ex2;

public class Main {

	public static void main(String[] args) {
		// 繰り返しfor文を使って配列の内容を表示させる
		// 1次元配列
		int[] array = { 10, 20, 30, 40, 50, 60 };
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]の値は" + array[i]);
		}
		System.out.println("--------------------------");
		// 2次元配列
		int[][] array2D = { { 1, 2, 3 }, { 4, 5, 6, 7 } };
		for (int column = 0; column < array2D.length; column++) {
			for (int row = 0; row < array2D[column].length; row++) {
				System.out.println("array[" + column + "][" + row + "]の値は" + array2D[column][row]);
			}
		}

	}

}
