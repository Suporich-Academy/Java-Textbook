public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("A", 4),
                new Car("B", 6),
                new Truck("C", 2.0),
                new Car("D", 4)
        };
        for (Vehicle vehicle : vehicles) {
            vehicle.print();
        }
    }
}
