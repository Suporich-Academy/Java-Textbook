package animals.bigzoo;

public class Main {
    public static void main(String[] args) {
        // 走るものを全て一つの配列に入れる
        Runnable[] runners = {
                new Cat("Alice"),
                new Dog("Bob"),
                new Car("Volvo"),
                new Car("Toyota")
        };

        // 走るものは全て走らせる
        for (Runnable runner : runners) {
            runner.run();
        }
    }
}
