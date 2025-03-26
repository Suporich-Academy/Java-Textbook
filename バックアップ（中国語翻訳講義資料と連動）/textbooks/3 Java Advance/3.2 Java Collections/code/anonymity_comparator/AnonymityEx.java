package anonymity_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import cat_comparator.Cat;


public class AnonymityEx {
	public static void main(String[] args) {

		List<Cat> list = new ArrayList<Cat>();
		list.add(new Cat("Alice", 12.5));
		list.add(new Cat("Bob", 18.7));
		list.add(new Cat("Mai", 14.5));


		Collections.sort(list,new Comparator<Cat>(){
			@Override
			public int compare(Cat cat1, Cat cat2) {
				if (cat1.getWeight() == cat2.getWeight()) {
					return 0;
				} else if (cat1.getWeight() < cat2.getWeight()) {
					return -1;
				} else {
					return 1;
				}
			}
		});
		  System.out.println(list);
	}
}
