package lesson3.lesson3_2.colections_seinou.comparator_ex;

import java.util.Comparator;

public class CatComparator implements Comparator<Cat>{
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
}

