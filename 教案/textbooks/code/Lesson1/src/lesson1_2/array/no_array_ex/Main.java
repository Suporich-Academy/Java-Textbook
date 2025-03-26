package lesson1_2.array.no_array_ex;

public class Main {

	public static void main(String[] args) {
		// 大学のテスト科目を変数で宣言し、点数を変数に代入
		// ロボット工学
		int robotics = 72;
		// 電子回路
		int electronicCircuits = 85;
		// 機械設計
		int machineDesign = 95;
		// 人工知能
		int artificialIntelligence = 77;
		// テストの点数の合計点
		int total = robotics + electronicCircuits + machineDesign + artificialIntelligence;
		// 合計点の表示
		System.out.println("テストの合計点は" + total);//⇒テストの合計点は329
		// 平均値を求めて表示
		System.out.println("平均点は" + total / 4);//⇒平均点は82
	}
}

