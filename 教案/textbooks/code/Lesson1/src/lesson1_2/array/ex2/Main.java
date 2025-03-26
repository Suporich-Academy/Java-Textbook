package lesson1_2.array.ex2;

public class Main {

	public static void main(String[] args) {
		// 配列変数の宣言と代入を同時に行う
		int[] scores = new int[5];
		double[] staturet = new double[5];
		boolean[] authenticity = new boolean[5];
		String[] users = new String[5];
		// 参照
		System.out.println("データ型intの初期値" + scores[0]);
		System.out.println("データ型doubleの初期値" + staturet[0]);
		System.out.println("データ型booleanの初期値" + authenticity[0]);
		System.out.println("データ型Stringの初期値" + users[0]);
	}

}
