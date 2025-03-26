package lesson1_2.operator.arithmetic_operator;

public class Main {

	public static void main(String[] args) {
		// 足し算
		System.out.println(2 + 3);// ⇒5
		// 引き算
		System.out.println(19 - 8);// ⇒11
		// 割り算
		System.out.println(4 / 2);// ⇒10
		// 掛け算
		System.out.println(4 * 3);// ⇒12
		// 余りの計算
		System.out.println(10 % 3);// ⇒1
		// 注意すべき計算
		System.out.println(5 / 2);// ⇒2 小数点切り捨て
		// 演算時の自動型変換
		// 異なる型同士で計算すると「意味的に大きな型に統一されてから演算」される
		System.out.println(5.0 / 2);// ⇒2.5 小数点表示
		System.out.println(5 / 2.0);// ⇒2.5 小数点表示

		// 片方のデータ型がStringなら、もう片方もStringに変換して連結する
		System.out.println(2 + 5 + "10" + 35);// ⇒71035

	}

}