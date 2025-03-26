package lesson1_3.branch_statement.switch_statement.ex1;

public class Main {

	public static void main(String[] args) {
		// 運勢占いゲーム
		System.out.println("あなたの運勢を判断します");
		// 好きな番号を変数に格納する
		int fortune = 2;

		// fortuneという変数の値に基づいて異なる処理を行うswitch文
		switch (fortune) {
		// fortuneが1の場合
		case 1:
			// "大吉"をコンソールに表示
			System.out.println("大吉");
			// 処理を終了し、switch文を抜ける
			break;
		// fortuneが2の場合
		case 2:
			// "中吉"をコンソールに表示
			System.out.println("中吉");
			// 処理を終了し、switch文を抜ける
			break;
		// fortuneが3の場合
		case 3:
			// "小吉"をコンソールに表示
			System.out.println("小吉");
			// 処理を終了し、switch文を抜ける
			break;
		// 上記のいずれのcaseにも当てはまらない場合（デフォルト）
		default:
			// "凶"をコンソールに表示
			System.out.println("凶");
		}

	}

}
