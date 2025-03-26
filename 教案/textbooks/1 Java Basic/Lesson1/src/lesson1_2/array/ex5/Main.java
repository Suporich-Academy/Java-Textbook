package lesson1_2.array.ex5;

public class Main {

	public static void main(String[] args) {
		// 配列の初期化
		int[] score = { 20, 44, 68, 80, 100 };

		// 要素の数を出力する
		System.out.println(score.length);
		// ⇒5

		// インデックス番号を間違えると？
		// System.out.println(score[5]);
		// ⇒java.lang.ArrayIndexOutOfBoundsException

	}

}
