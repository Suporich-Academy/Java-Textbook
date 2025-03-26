package animals.bigzoo;

public class Fish extends Animal {
    Fish(String name_) {
        super(name_);
    }

    @Override
    void eat(String food) {
        System.out.print(name + " ate " + food + ", ");
        oink(); // 豚は食った後に鳴く
    }

    void oink() {
        System.out.println("oink, oink.");
    }
}
