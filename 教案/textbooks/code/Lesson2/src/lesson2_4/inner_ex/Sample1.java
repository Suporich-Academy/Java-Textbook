package lesson2_4.inner_ex;

public class Sample1 {
	String str1 = "外部クラスのフィールドです。";

	public void outerExe() {
		System.out.println("外部クラスのメソッドを実行しました。");
		//innerExe();//外部から内部を読んだらエラーになる。
	}

	class Sample2 {
		String str2 = "内部クラスのフィールドです。";
		public void innerExe() {
			System.out.println("内部クラスのメソッドを実行しました。");
			//外部クラスのフィールドにアクセス
			System.out.println(str1);
			//外部クラスのメソッドにアクセス
			outerExe();
		}
	}

}
