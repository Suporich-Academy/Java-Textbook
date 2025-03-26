package lesson3.lesson3_2.colections_seinou.map_ex;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		//Mapの宣言
		Map<String,Integer>studentAge = new HashMap<String,Integer>();
		//データの挿入:put
		studentAge.put("Alice", 10);
		studentAge.put("Bob", 18);
		studentAge.put("Carol", 20);
		System.out.println(studentAge);
		//データの取得
		System.out.println(studentAge.get("Bob"));
		//データの削除　remove
		System.out.println(studentAge.remove("Carol"));
		System.out.println(studentAge);
		//for-each
		for(String age:studentAge.keySet()) {
			//keyの値とvalue値
			System.out.println(age + " "+studentAge.get(age));
		}
	}

}
