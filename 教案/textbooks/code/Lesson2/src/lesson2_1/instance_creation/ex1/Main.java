package lesson2_1.instance_creation.ex1;

public class Main {

	public static void main(String[] args) {
		//インスタンスの作成
		Cat alice = new Cat();
		//メンバ変数へ値の代入
		alice.name = "Alice";
		alice.color = "red";
		alice.age = 3;

		System.out.println("猫の名前は"+alice.name+"色は"+alice.color+"で年齢は"+alice.age);
		//⇒猫の名前はAlice色はredで年齢は3
		//振る舞いの呼び出し
		alice.eat("キャットフード");
		//⇒Aliceはキャットフードを食べます
		// ニャー！
	}

}
