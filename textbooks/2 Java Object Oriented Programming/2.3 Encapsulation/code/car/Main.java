package car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(100);
        System.out.println(car.getPrice()); // => 100
//        car.setPrice(100); // error
    }
}
