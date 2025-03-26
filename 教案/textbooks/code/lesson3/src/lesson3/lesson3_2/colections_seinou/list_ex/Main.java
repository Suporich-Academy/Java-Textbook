package lesson3.lesson3_2.colections_seinou.list_ex;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//リストの宣言
		List<String> studentNames = new ArrayList<String>();
		//データの挿入
		studentNames.add("Alice");
		studentNames.add("Bob");
		studentNames.add("Carol");
		studentNames.add(3,"Dave");
		System.out.println(studentNames);
		//削除
		//インデックス番号を指定した削除
		studentNames.remove(3);
		System.out.println(studentNames);
		//データがあれば削除
		studentNames.remove("Alice");
		System.out.println(studentNames);
		//データの取得
		System.out.println(studentNames.get(0));
		//データの要素数を数える length
		System.out.println(studentNames.size());
		//for-each
		for(String name:studentNames) {
			System.out.println(name);
		}
	}

}
