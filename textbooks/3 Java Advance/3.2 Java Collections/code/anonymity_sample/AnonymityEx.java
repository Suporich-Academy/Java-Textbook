package anonymity_sample;

interface SampleEx { // SampleExインタフェースの定義
	public void practice(); // 抽象メソッド「practice()」を定義
}

public class AnonymityEx {

	public static void main(String[] args) {
		SampleEx sampleEx = new SampleEx() { // SampleEx型の変数「sampleEx」を定義し、匿名クラスで実装する

			@Override // インタフェースに定義された抽象メソッドのオーバーライド
			public void practice() {
				System.out.println("practiceメソッドのオーバーライド");
			}
		};

		// 定義されたローカル変数の「sampleExはスコープ内で呼び出しが可能になります。
		sampleEx.practice();
		// sampleExオブジェクトのpractice()メソッドを呼び出す。
	}
}
