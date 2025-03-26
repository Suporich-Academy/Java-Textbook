package lesson3.lesson3_2.colections_seinou.stack_ex;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// stackの宣言
		Stack<String>studentNames = new Stack<String>();
       //データの挿入
		studentNames.push("Alice");
		studentNames.push("Bob");
		studentNames.push("Carol");
		//先頭の要素を取得した後に削除するpop
		System.out.println(studentNames.pop());
		System.out.println(studentNames);
		//先頭の要素を取得するが削除しない　peek
		System.out.println(studentNames.peek());
		System.out.println(studentNames);
		//要素数の確認
		System.out.println(studentNames.size());
	}

}
