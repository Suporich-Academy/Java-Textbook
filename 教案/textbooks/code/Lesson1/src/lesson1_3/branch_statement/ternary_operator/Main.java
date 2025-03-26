package lesson1_3.branch_statement.ternary_operator;

public class Main {

	public static void main(String[] args) {
		// 年齢を表す変数を宣言して初期化
		int age = 20;

		// 三項演算子を使用して、年齢が18歳以上かどうかを判定し、
		// 結果に基づいてメッセージを設定
		String message = (age >= 18) ? "成人です" : "未成年です";

		// メッセージをコンソールに出力
		System.out.println(message);
		// ⇒成人です

	}

}
