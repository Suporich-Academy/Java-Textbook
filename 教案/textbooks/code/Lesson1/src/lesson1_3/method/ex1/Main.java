package lesson1_3.method.ex1;

public class Main {

	public static void main(String[] args) {
		// メソッドを呼び出す
		greeting();//⇒こんにちは！

		// 一度部品を作成してしまえば、部品名だけを記載することで何度も呼び出すことができる
		// greeting();
		// greeting();
		// greeting();
	}

	// 挨拶をするメソッドを作成
	static void greeting() {
		System.out.println("こんにちは！");
	}

}
