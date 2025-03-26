package lesson2_4.enum_ex.ex2;

public enum Fruit {
	ORANGE("オレンジ"),APPLE("りんご"),CHERRY("さくらんぼ");

	//定数の説明（和名）を格納するためのメンバ変数
	private String japanese;

	private Fruit(String japanese) {
		this.japanese = japanese;
	}

	//和名を表示する
	public String getJapanese() {
		return japanese;
	}

}
