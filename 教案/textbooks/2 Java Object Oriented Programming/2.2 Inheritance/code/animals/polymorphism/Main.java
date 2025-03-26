package animals.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal kitty = new Cat("Kitty");
        Animal iggy = new Dog("Iggy");
        kitty.eat("cat food");
        iggy.eat("dog food");
    }
}
