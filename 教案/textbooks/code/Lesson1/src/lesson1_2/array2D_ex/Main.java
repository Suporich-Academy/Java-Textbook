package lesson1_2.array2D_ex;

public class Main {

	public static void main(String[] args) {
		// 2次元配列の初期化
		int[][] array2D = { { 2, 4, 6 }, { 8, 10, 12 } };
		System.out.println(array2D[0][0]);// ⇒2

		// 要素の個数を調べるlengthについても1次元配列と考え方が違うことを説明する
		// 縦列の要素数を取得する
		System.out.println(array2D.length);// ⇒2
		// 横列の要素数を取得する
		System.out.println(array2D[0].length);// ⇒3
		System.out.println(array2D[1].length);// ⇒3

		// 2次元配列の初期化
		// 横列の個数がバラバラでも作成することができることを実現する
		int[][] arrays = { { 9, 8, 7, 6 }, { 5, 4, 3 }, { 2, 1 } };
		System.out.println(arrays[0][0]);// ⇒9
		System.out.println(arrays[0][1]);// ⇒8
		System.out.println(arrays[0][2]);// ⇒7
		System.out.println(arrays[0][3]);// ⇒6
		System.out.println(arrays[1][0]);// ⇒5
		System.out.println(arrays[1][1]);// ⇒4
		System.out.println(arrays[1][2]);// ⇒3
		System.out.println(arrays[2][0]);// ⇒2
		System.out.println(arrays[2][1]);// ⇒1

		// エラー
		// 横列の個数の最大の個数が4であれば、全部横列の個数が4個であると
		// 勘違いする生徒が多数いるため、そうでないことを説明する
		//System.out.println(array2D[1][3]);
		//System.out.println(array2D[2][2]);
		//System.out.println(array2D[2][3]);

	}

}
