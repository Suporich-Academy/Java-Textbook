package animals.polymorphism;

public class Cat extends Animal {
    Cat(String name_) {
        super(name_);
    }

    @Override
    void eat(String food) {
        System.out.print(name + " ate " + food + ", ");
        meow(); // 猫が食べた後にニャーと鳴く
    }

    void meow() {
        System.out.println("meow~");
    }
}
