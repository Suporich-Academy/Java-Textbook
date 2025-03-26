package animals.bigzoo;

public class Dog extends Animal implements Runnable {
    Dog(String name_) {
        super(name_);
    }

    @Override
    void eat(String food) {
        System.out.print(name + " ate " + food + ", ");
        bowWow(); // 犬が食べた後に吠える
    }

    void bowWow() {
        System.out.println("BOWWOW!!!");
    }

    @Override
    public void run() {
        System.out.print(name + " is running! ");
        bowWow();
    }
}
