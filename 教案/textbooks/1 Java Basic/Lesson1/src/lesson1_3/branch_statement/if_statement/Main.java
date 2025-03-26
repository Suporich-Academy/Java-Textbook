package lesson1_3.branch_statement.if_statement;

public class Main {

	public static void main(String[] args) {
		// 天気が晴れだったらtrueとする
		// 雨だったらfalseとする（false）にした場合、
		// 洗濯物を干すという内容が表示されないことを確認
		boolean weather = true;

		// もし天気が晴だったら洗濯物を干す
		if (weather == true) {
			System.out.println("洗濯物を干す");
		}

	}

}
