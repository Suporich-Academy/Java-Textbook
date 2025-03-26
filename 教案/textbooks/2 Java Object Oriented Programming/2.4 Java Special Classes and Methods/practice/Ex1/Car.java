package ex1;

public class Car extends Vehicle {
    private int seat;

    public Car(String name, int seat) {
        super(name);
        this.seat = seat;
    }

    /**
     * デフォルトの座位数は 4
     */
    public Car(String name) {
    	this(name, 4);
    }

    public int getSeat() {
        return seat;
    }

    @Override
    public void print() {
        System.out.println("A car named " + name +
                " having " + seat + " seats" +
                " is in position " + position +
                ", running at a speed of " + speed + "."
        );
    }
}
