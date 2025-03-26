package lesson1_2.unicode;

public class UnicodeExample {

	public static void main(String[] args) {
		// 文字列を定義
		String myString = "A";

		// 文字列からUnicodeのコードポイントを取得
		int unicodeCodePoint = myString.codePointAt(0);

		// Unicodeのコードポイントを16進数で表示
		String hexRepresentation = Integer.toHexString(unicodeCodePoint);

		// 結果を出力
		System.out.println("文字列: " + myString);
		// 文字列: A
		System.out.println("Unicodeのコードポイント: " + unicodeCodePoint);
		// Unicodeのコードポイント: 65
		System.out.println("16進数表記: 0x" + hexRepresentation.toUpperCase());
		// 16進数表記: 0x41
	}

}
