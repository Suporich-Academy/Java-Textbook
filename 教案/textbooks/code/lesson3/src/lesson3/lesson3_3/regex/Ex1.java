package lesson3.lesson3_3.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

	public static void main(String[] args) {
		// Stringクラスのmatcherメソッドを使って正規表現にマッチするかを確認する
		String str = "Apple";
		System.out.println(str.matches("A[pqr]+le"));

		// Patternクラスのメソッドとしてmatches
		System.out.println(Pattern.matches("A[pqr]+le", str));

		// PatternクラスとMacherクラスを使って部分文字列を検索する
		Matcher matcher = Pattern.compile("A[pqr]+le").matcher("Apple Abcde Appqqqrle Banana");
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		System.out.println(valid("Apple"));
	}

	public static boolean valid(String a) {
		return Pattern.matches("A[pqr]+le", a);
	}

}
