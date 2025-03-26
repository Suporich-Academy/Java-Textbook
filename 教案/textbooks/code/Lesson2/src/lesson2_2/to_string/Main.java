package lesson2_2.to_string;

public class Main {

	public static void main(String[] args) {
		Cat kitty = new Cat("kitty", 3);
		System.out.println(kitty);
		// toStringを書いて無い状態の出力結果
		// ⇒lesson2_2.to_string.Cat@4517d9a3
		// toStringを書いた状態の出力結果
		// ⇒Cat [name=kitty, age=3]
	}

}
