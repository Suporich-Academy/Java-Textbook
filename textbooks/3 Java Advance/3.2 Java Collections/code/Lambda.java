import java.util.ArrayList;
import java.util.List;

public class Lambda {
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

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>(List.of(
                new Cat("Alice", 4.5),
                new Cat("Bob", 3.5),
                new Cat("Carol", 5)
        ));
        System.out.println(cats); // => [Cat[Alice, weight: 4.5], Cat[Bob, weight: 3.5], Cat[Carol, weight: 5.0]]
        // ラムダ式を使って、クラスを定義・インスタンス化することなくインターフェースを実装できる
        cats.sort(
                (cat1, cat2) -> {
                    if (cat1.weight == cat2.weight) {
                        return 0;
                    } else if (cat1.weight < cat2.weight) {
                        return -1;//1
                    } else {
                        return 1;//-1にすると降順
                    }
                }
        );
        System.out.println(cats); // => [Cat[Bob, weight: 3.5], Cat[Alice, weight: 4.5], Cat[Carol, weight: 5.0]]
    }
}