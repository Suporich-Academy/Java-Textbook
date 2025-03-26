package animals;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal(); // Animal は抽象クラスであるため、エラーが発生する
        Cat kitty = new Cat("Kitty");
        kitty.eat("fish"); // => Kitty ate fish, meow~
    }
}
