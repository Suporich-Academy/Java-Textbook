public class Cat {
    String name;
    int age;

    /**
     * コンストラクタ
     */
    Cat(String name_, int age_) {
        name = name_;
        age = age_;
    }

    /**
     * 「ニャ～」と鳴く
     */
    void meow() {
        System.out.println("meow~");
    }

    /**
     * 食べ物を食べる
     */
    void eat(String food) {
        System.out.print(name + " ate " + food + ", ");
        meow();
    }

    public static void main(String[] args) {
        Cat alice = new Cat("Alice", 5);
        Cat bob = new Cat("Bob", 6);
        System.out.println(alice.age); // => 5

        bob.eat("catfood"); // => Bob ate cat food, meow~
    }
}
