package lesson1_3.method.overload;

public class Main {

	public static void main(String[] args) {
		System.out.println("引数2つ(int型)のメソッド：" + add(2, 2));
		// ⇒引数2つ(int型)のメソッド：4
		System.out.println("引数1つ(int型)のメソッド：" + add(10));
		// ⇒引数1つ(int型)のメソッド：11
		System.out.println("引数2つ(double型)のメソッド：" + add(2.5, 1.1));
		// ⇒引数2つ(double型)のメソッド：3.6
	}

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a) {
		return a + 1;
	}

	static double add(double a, double b) {
		return a + b;
	}

	// オーバーロード出来ない例
	// 引数の変数名だけが異なっている
	/*
	 * public int add(int a) { // 処理 }
	 *
	 * public int add(int b) { // 処理 }
	 */

	// 戻り値だけが異なっている
	/*
	 * public int add(int a) { // 処理 }
	 *
	 * public double add(int a) { // 処理 }
	 */
	// 変数名や戻り値の型だけが異なっている場合は、コンパイルエラーとなりエラーメッセージが表示。
}
