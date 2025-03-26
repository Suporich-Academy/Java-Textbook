package lesson1_3.branch_statement.if_else_if_else_statement;

public class Main {

	public static void main(String[] args) {
		// 点数を入れる変数
		// 全ての結果が見れるように点数を91,72,30と変更して動きを生徒に確認させる
		int score = 90;
		// もし、scoreが90点より大きければA評価
		// そうではなく、もし点数が60点より大きければC評価
		// それ以外は不合格
		if (score > 90) {
			System.out.println("A評価");
		} else if (score > 60) {
			System.out.println("C評価");
		} else {
			System.out.println("不合格");
		}

	}

}
