package lesson2_1.constructor_use;

public class Cat {
	// 属性（メンバ変数）
	// 猫の名前
	String name;
	// 猫の色
	String color;
	// 猫の年齢
	int age;

	public Cat(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	// 振る舞い（メソッド）
	// 食べるメソッド
	void eat(String food) {
		System.out.println(name + "は" + food + "を食べます");
		meow();
	}

	// 猫の鳴き声メソッド
	void meow() {
		System.out.println("ニャー！");
	}

}