package lesson1_3.method.ex3;

public class Main {

	public static void main(String[] args) {
		// メソッドを呼び出す
		// 引数は複数指定することができ、引数で書いた順番を見て
		// パラメーター側のソースを書く必要がある。
		greeting("山田", 22);// ⇒こんにちは！山田 年齢は22です
		greeting("太郎", 18);// ⇒こんにちは！太郎 年齢は18です

	}

	// 挨拶をするメソッドを作成
	static void greeting(String name, int age) {
		System.out.println("こんにちは！" + name + " " + "年齢は" + age + "です");
	}
}