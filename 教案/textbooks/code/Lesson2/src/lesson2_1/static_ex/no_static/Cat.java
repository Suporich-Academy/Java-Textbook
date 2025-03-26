package lesson2_1.static_ex.no_static;

public class Cat {

	//インスタンスの個数を格納するメンバ変数
	int counter = 0;
	//コンストラクタ
	public Cat() {
		counter++;
		System.out.println(counter);
	}
}
