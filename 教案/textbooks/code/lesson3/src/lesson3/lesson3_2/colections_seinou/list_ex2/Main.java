package lesson3.lesson3_2.colections_seinou.list_ex2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// リストの作成
		//List<Cat> cats = new ArrayList<Cat>();
		List<Cat> cats = new LinkedList<Cat>();
		//データの挿入
		cats.add(new Cat("Kitty",2));
		cats.add(new Cat("Dave",5));
		cats.add(new Cat("Bob",3));

		for(Cat cat:cats) {
			System.out.println(cat);
			System.out.println(cat.getAge());
		}
		//リストを作成
		//num
		//入れるデータ型は整数　10，20，30
		//リストにデータが入っているかを表示させてください
		List<Integer>num = new ArrayList<Integer>();
		//挿入
	    num.add(10);
	    num.add(20);
	    num.add(30);
	    System.out.println(num);


	}

}
