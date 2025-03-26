package lesson1_2.operator.logical_operator;

public class Main {

	public static void main(String[] args) {
		// 変数の初期化
		int a = 7;
		int b = 4;

		// 論理積
		System.out.println(a < 9 && b > 3);// ⇒true
		System.out.println(a < 9 && b > 7);// ⇒false
		System.out.println(a < 5 && b > 3);// ⇒false
		System.out.println(a < 5 && b > 7);// ⇒false
		// 論理和
		System.out.println(a < 9 || b > 3);// ⇒true
		System.out.println(a < 9 || b > 7);// ⇒true
		System.out.println(a < 5 || b > 3);// ⇒true
		System.out.println(a < 5 || b > 7);// ⇒false

		// 否定
		System.out.println(!(a < 9));// ⇒false
		System.out.println(!(a > 9));// ⇒true

	}

}
