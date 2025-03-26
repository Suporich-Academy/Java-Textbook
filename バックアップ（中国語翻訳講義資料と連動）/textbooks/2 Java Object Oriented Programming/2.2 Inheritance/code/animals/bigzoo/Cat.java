package animals.bigzoo;

public class Cat extends Animal implements Runnable {
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

    @Override
    public void run() {
        System.out.print(name + " is running! ");
        meow();
    }
}
