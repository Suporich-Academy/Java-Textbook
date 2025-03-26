import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort {
    static private class Cat {
        private String name;
        private double weight;

        private Cat(String name, double weight) {
            this.name = name;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Cat[" + name + ", weight: " + weight + "]";
        }
    }

    /**
     * 2 匹の猫の大きさを比較するためのコンパレーター
     */
    private static class CatComparator implements Comparator<Cat> {
        /**
         * 2 匹の猫の大きさを体重で比較する。軽い方が「小さい」。
         */
        @Override
        public int compare(Cat cat1, Cat cat2) {
            if (cat1.weight == cat2.weight) {
                return 0;
            } else if (cat1.weight < cat2.weight) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>(List.of(
                new Cat("Alice", 4.5),
                new Cat("Bob", 3.5),
                new Cat("Carol", 5)
        ));
        System.out.println(cats); // => [Cat[Alice, weight: 4.5], Cat[Bob, weight: 3.5], Cat[Carol, weight: 5.0]]
        cats.sort(new CatComparator());
        System.out.println(cats); // => [Cat[Bob, weight: 3.5], Cat[Alice, weight: 4.5], Cat[Carol, weight: 5.0]]
    }
}