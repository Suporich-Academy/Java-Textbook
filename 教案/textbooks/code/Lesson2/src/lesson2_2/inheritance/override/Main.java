package lesson2_2.inheritance.override;

public class Main {

	public static void main(String[] args) {
		Cat kitty  = new Cat("Alice",3,"black");
		kitty.eat();
		//⇒Aliceはキャットフードを食べます。

		Animal alice = new Cat("Alice",3,"black");
		alice.eat();
	}

}
