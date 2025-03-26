public class Truck extends Vehicle {
    double load;

    Truck(String name_, double load_) {
        super(name_);
        load = load_;
    }

    @Override
    void print() {
        System.out.println("A truck named " + name +
                " which can carry " + load + " t" +
                " is in position " + position +
                ", running at a speed of " + speed + "."
        );
    }
}
