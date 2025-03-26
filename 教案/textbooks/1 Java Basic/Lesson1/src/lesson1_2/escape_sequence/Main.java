package lesson1_2.escape_sequence;

public class Main {

	public static void main(String[] args) {
		// System.out.println("これは"ダブルクォーテーションマークの数が一致しないのでエラーとなり実行出来ません。");
		System.out.println("文字列の途中に\"ダブルクォーテーションマークが表示されます。");
		// =>文字列の途中に"ダブルクォーテーションマークが表示されます。

		System.out.println("文章の途中で\n改行されます。");
		/**
		 * ⇒文章の途中で
		 *  改行されます。
		 **/
		System.out.println("こちらはn改行されません。");
		// ⇒こちらはn改行されません。
	}

}
