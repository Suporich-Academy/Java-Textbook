package lesson1_2.operator.assignment_operator;

public class Main {

	public static void main(String[] args) {
		//変数の初期化
		int a = 10;
		int total1 = 0;
		total1 = a + total1;
        //結果の表示
		System.out.println(total1);
		//変数の初期化
		int b = 10;
		int total2 = 0;
        total2 += b;
        //結果の表示
		System.out.println(total2);
	}

}
