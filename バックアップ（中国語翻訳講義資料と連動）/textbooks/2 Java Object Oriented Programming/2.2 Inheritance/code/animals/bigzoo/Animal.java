package animals.bigzoo;

public class Animal {
    String name;

    Animal(String name_) {
        name = name_;
    }

    void eat(String food) {
        System.out.println(name + " ate " + food + ".");
    }
}
