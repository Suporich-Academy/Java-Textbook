package lesson2_4.abstract_class.ex1;

public abstract class Animal {
	// メンバ変数
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	// 鳴く
	public void sounds() {
		System.out.println(name + " make sounds");
	}

	// 未実装（何も処理を書かないメソッド）
	protected abstract void eat(String food);

}
