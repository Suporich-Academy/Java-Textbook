package lesson2_2.inheritance.ex1;

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
	// 眠る
	void sleep(int time) {
		System.out.println(time + "時間の睡眠を取る");
	}



}
