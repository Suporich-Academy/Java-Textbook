package ex1;

public class Truck extends Vehicle {
    private double load;

    public Truck(String name, double load) {
        super(name);
        this.load = load;
    }

    /**
     * デフォルトの負荷は 1 トン
     */
    public Truck(String name) {
        this(name, 1.0);
    }

    public double getLoad() {
        return load;
    }

    @Override
    public void print() {
        System.out.println("A truck named " + name +
                " which can carry " + load + " t" +
                " is in position " + position +
                ", running at a speed of " + speed + "."
        );
    }
}
