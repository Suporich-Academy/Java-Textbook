package cat_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Cat> list = new ArrayList<Cat>();
		list.add(new Cat("Alice", 12.5));
		list.add(new Cat("Bob", 18.7));
		list.add(new Cat("Mai", 14.5));

		Collections.sort(list, new CatComparator());
		System.out.println(list);
	}

	//実行結果
	//[Cat[Alice, weight: 12.5], Cat[Mai, weight: 14.5], Cat[Bob, weight: 18.7]]

}
