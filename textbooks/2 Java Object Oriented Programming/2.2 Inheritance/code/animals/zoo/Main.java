package animals.zoo;

public class Main {
    public static void main(String[] args) {
        // 全ての動物を一つの配列に入れる
        Animal[] animals = {
                new Cat("Alice"),
                new Dog("Bob"),
                new Pig("Charlie"),
                new Dog("Dave")
        };

        // 動物によって、食べる挙動が違う
        for (Animal animal : animals) {
            animal.eat("pet food");
        }
    }
}
