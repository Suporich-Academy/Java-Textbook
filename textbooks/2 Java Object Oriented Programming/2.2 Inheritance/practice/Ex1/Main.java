public class Main {
    public static void main(String[] args) {
        Car car = new Car("A", 4);
        Truck truck = new Truck("B", 1.0);
        car.speedUp(10);
        car.move();
        car.move();
        System.out.println("A car named " + car.name +
                " is in position " + car.position +
                ", running at a speed of " + car.speed + "."
        ); // => A car named A is in position 20.0, running at a speed of 10.0.
    }
}
