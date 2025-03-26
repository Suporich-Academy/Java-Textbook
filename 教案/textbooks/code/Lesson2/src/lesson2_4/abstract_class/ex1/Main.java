package lesson2_4.abstract_class.ex1;

public class Main {

	public static void main(String[] args) {
		// Animalクラスをインスタンス化するとエラー
		// Animal animal = new Animal("animal");
		// ⇒Cannot instantiate the type Animal

		Cat kitty = new Cat("kitty");
		kitty.eat("cat food");
		// ⇒kitty ate cat food

	}

}
