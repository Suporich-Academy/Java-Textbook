package ex1;

public abstract class Vehicle {
    protected String name;
    protected double speed;
    protected double position;

    public void move() {
        position += speed;
    }

    public void speedUp(double delta) {
        if (delta < 0) return;
        speed += delta;
    }

    public void speedDown(double delta) {
        if (delta < 0) return;
        speed -= delta;
        if (speed < 0) {
            speed = 0;
        }
    }

    public abstract void print();

    protected Vehicle(String name) {
        this.name = name;
        speed = 0;
        position = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getPosition() {
        return position;
    }
}
