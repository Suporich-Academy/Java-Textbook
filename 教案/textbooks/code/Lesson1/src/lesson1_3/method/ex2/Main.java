package lesson1_3.method.ex2;

public class Main {

	public static void main(String[] args) {
		// メソッドを呼び出す
		greeting("山田");// ⇒こんにちは！山田
		greeting("太郎");// ⇒こんにちは！太郎

	}

	// 挨拶をするメソッドを作成
	static void greeting(String name) {
		System.out.println("こんにちは！" + name);
	}
}
