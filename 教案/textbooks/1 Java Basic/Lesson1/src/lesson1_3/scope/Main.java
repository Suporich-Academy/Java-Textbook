package lesson1_3.scope;

public class Main {

	public static void main(String args[]) {
		int a = 0;

		if (true) {
			int b = 0;
		}
		a = 1;// aはmainの{}の間で参照できる
		// b = 1;// bはifの外なのでコンパイルエラー
	}
	// a = 2;// mainの外なのでコンパイルエラー

	public static void sub() {
		// a = 3;// mainの外にあるメソッドなのでコンパイルエラー
	}

}
