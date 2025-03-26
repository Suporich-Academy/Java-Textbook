package lesson2_4.inner_ex;

//外部クラス
class OuterClass {
	// staticなフィールド
	private static String str = "OuterClassの変数";
	private String name ="akemi";
	public void outerEx() {
		this.name =str;
	}

	// staticな内部クラス
	static class InnerClass {
		String str2 = "内部クラスのフィールドです。";
		public void innerSample() {
			//外部クラスのフィールドにアクセス
			System.out.println(str);
			//外部クラスのメソッドにアクセス
			//outerEx();//エラー
		}
		public void innerSample2() {
			//System.out.println(name);//エラー
			System.out.println("内部クラスのメソッドです。");
		}
	}


}

public class Main1 {

	public static void main(String[] args) {
		//外部クラス名.内部クラス名 内部クラスのオブジェクト名 = new 外部クラス名.内部クラス名();
		// staticな内部クラスのインスタンスを生成
		OuterClass.InnerClass ic = new OuterClass.InnerClass();
		ic.innerSample();
		//ic.outerEx();
	}

}