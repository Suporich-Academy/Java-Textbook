public class Car extends Vehicle {
    int seat;

    Car(String name_, int seat_) {
        super(name_);
        seat = seat_;
    }

    @Override
    void print() {
        System.out.println("A car named " + name +
                " having " + seat + " seats" +
                " is in position " + position +
                ", running at a speed of " + speed + "."
        );
    }
}
