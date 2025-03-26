package lesson3.lesson3_2.colections_seinou.que_ex;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		//キューの宣言
		Queue<String>studentNames = new LinkedList<String>();
		//データの挿入
		studentNames.offer("Alice");
		studentNames.offer("Bob");
		studentNames.offer("Carol");
		//先頭の要素を取得して削除する
		System.out.println(studentNames.poll());
		System.out.println(studentNames);
		//先頭の要素を取得して削除しない　peek
		System.out.println(studentNames.peek());
		System.out.println(studentNames);
		System.out.println(studentNames.size());

	}

}
