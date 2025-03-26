package lesson2_2.polymorphism;

public class Main {

	public static void main(String[] args) {
		Animal kitty = new Cat("kitty");
		//エラーになる
		//kitty.mewo();

		Animal[] animals = {
				new Cat("Alice"),
				new Dog("Bob")
		};
		for(Animal animal :animals) {
			animal.eat("エサ");
		}
		/**
		 * ⇒Aliceはエサを食べる
		 * ニャーニャー
		 * Bobはエサを食べる
		 * ワンワン
		 * **/
	}

}
