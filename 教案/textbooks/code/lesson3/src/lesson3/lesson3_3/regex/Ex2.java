package lesson3.lesson3_3.regex;

import java.util.regex.Pattern;

public class Ex2 {

	public static void main(String[] args) {
     System.out.println(isUsernameValid("Alice1234"));
     System.out.println(isUsernameValid("%&($"));
     System.out.println(isPasswordValid("abc_1234_bbgty"));
     System.out.println(isPasswordValid("abc_"));
	}

	//ユーザー名をチェックするメソッド
	public static boolean isUsernameValid(String username) {
		return username.matches("[a-zA-Z0-9]+");
	}
	//ユーザー名をチェックするメソッドPatternクラスを使った書き方
	public static boolean isUsernameValid2(String username) {
		return Pattern.matches("[a-zA-Z0-9]+", username);
	}
	//パスワードのチェック
	public static boolean isPasswordValid(String password) {
		return password.matches("[a-zA-Z0-9_]{8,}");
	}




}
