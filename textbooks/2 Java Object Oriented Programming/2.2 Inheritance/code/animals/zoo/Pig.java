package animals.zoo;

public class Pig extends Animal {
    Pig(String name_) {
        super(name_);
    }

    @Override
    void eat(String food) {
        System.out.print(name + " ate " + food + ", ");
        oink(); // 豚は食べた後に鳴く
    }

    void oink() {
        System.out.println("oink, oink.");
    }
}
