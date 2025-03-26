package lesson2_2.inheritance.ex1;

public class Main {

	public static void main(String[] args) {
		Cat alice = new Cat("Alice", 3, "黒");
		System.out.println(alice.name);
		// ⇒Alice
		System.out.println(alice.age);
		// ⇒3
		System.out.println(alice.color);
		// ⇒黒
		alice.sleep(4);
		// ⇒4時間の睡眠を取る
		alice.mewo();
		// ⇒ニャー
	}

}
