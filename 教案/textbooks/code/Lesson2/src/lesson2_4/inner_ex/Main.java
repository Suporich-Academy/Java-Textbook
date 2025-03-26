package lesson2_4.inner_ex;

public class Main {

	public static void main(String[] args) {
		//外部クラス名 外部クラスのオブジェクト名 = new 外部クラス名();
		//外部クラス名.内部クラス名 内部クラスのオブジェクト名 = 外部クラスのオブジェクト名.new 内部クラス名();

		//外部クラスのインスタンス化
		Sample1 sample1 = new Sample1();

		//内部クラスのインスタンス化
		Sample1.Sample2 sample2 = sample1.new Sample2();

		//外部クラスのインスタンスから外部クラスのメンバ変数を呼ぶ
		System.out.println(sample1.str1);
		//外部クラスのインスタンスから外部クラスのメソッドを呼び出す。
		sample1.outerExe();
		//外部クラスから内部クラスのメンバ変数を呼び出すことはできない。
		//System.out.println(sample1.str2);
		System.out.println("--------------------");
		//内部クラスから内部クラスのメンバ変数を呼び出す
		System.out.println(sample2.str2);
		sample2.innerExe();
		//System.out.println(sample2.str1);
	    //sample2.outerExe();

	}

}
