package cat_nocomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cat_comparator.Cat;

public class NoComparator {

	public static void main(String[] args) {

		List<Cat> list = new ArrayList<Cat>();
		list.add(new Cat("Alice", 12.5));
		list.add(new Cat("Bob", 18.7));
		list.add(new Cat("Mai", 14.5));

		Collections.sort(list);

	}
}
