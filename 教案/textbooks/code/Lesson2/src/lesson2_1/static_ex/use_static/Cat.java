package lesson2_1.static_ex.use_static;

public class Cat {
	// 属性 猫の個数を数える変数を宣言
	static int counter = 0;
	// staticではないメンバ変数を宣言
	String name;

	Cat(String name) {
		counter++;
		this.name = name;
	}

	// 振る舞い（staticがついていないもの）
	//インスタンスを作成しないと呼び出せない
	public void meow() {
		System.out.println(counter);
		System.out.println(name + ":meow");
	}

	static void display() {
		System.out.println(counter);
		// staticではないため呼び出せない
		meow();
	}

}