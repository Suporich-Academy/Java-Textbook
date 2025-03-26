package animals.bigzoo;

public class Car implements Runnable {
    String brand;

    Car(String brand_) {
        brand = brand_;
    }

    @Override
    public void run() {
        System.out.println("A " + brand + " car is running! beep-- beep--");
    }
}
