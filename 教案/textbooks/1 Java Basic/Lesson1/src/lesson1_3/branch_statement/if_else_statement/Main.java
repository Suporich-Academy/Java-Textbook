package lesson1_3.branch_statement.if_else_statement;

public class Main {

	public static void main(String[] args) {
		// 天気が晴れだったらtrueとする
		// 雨だったらfalseとする（false）にした場合、
		// 昼寝をするという内容が表示されることを確認
		boolean weather = true;

		// もし天気が晴だったら洗濯物を干す
		// そうでない場合（else）時は昼寝をする
		if (weather == true) {
			System.out.println("洗濯物を干す");
		} else {
			System.out.println("昼寝をする");
		}

	}

}
