package lesson2_2.inheritance.override;

public class Animal {

	// 動物の名前
	String name;
	// 動物の年齢
	int age;

	// コンストラクタ作成
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 振る舞い
	// 食べる
	void eat() {
		System.out.println("食べ物を食べます。");
	}

}