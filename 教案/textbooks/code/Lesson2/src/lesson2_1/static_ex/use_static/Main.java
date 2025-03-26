package lesson2_1.static_ex.use_static;

public class Main {

	public static void main(String[] args) {
		//インスタンスの作成
		Cat kitty = new Cat("kitty");

		Cat bob = new Cat("bob");
		Cat alice = new Cat("alice");

		//staticな変数を呼び出す
		System.out.println(Cat.counter);//⇒3
		System.out.println(alice.counter);//⇒3
	}
}
