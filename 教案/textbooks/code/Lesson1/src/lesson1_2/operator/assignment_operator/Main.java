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
		
		//インクリメント
		int z = 1;
		z++;
		System.out.println(z);//2
		
		int y = 1;
		++y;
		System.out.println(y);//2
		
		//インクリメント2
		int g = 1;
		int f = 1;
		
		g = ++g + 1; 
		f= f++ + 1;
		System.out.println(g);//3
		System.out.println(f);//2
		g = ++g + 1; 
		f= f++ + 1;
		System.out.println(g);//5
		System.out.println(f);//3
	}

}
