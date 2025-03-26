package lesson2_2.inheritance.override;

public class Cat extends Animal {
	// 猫独自のメンバ変数
	String color;

	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	// 猫独自の振る舞い
	void mewo() {
		System.out.println("ニャー");
	}

	@Override
	void eat() {
		System.out.println(name + "はキャットフードを食べます。");
	}
}
