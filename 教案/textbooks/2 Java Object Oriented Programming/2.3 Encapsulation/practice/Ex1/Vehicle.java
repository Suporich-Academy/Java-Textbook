package ex1;

public class Vehicle {
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

    public void print() {
        // 空白のまま、サブクラスでオーバーライド
    }

    protected Vehicle(String name_) {
        name = name_;
        speed = 0;
        position = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name_) {
        name = name_;
    }

    public double getSpeed() {
        return speed;
    }

    public double getPosition() {
        return position;
    }
}
