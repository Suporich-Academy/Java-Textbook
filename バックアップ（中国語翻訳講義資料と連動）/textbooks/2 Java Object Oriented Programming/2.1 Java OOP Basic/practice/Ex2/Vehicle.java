public class Vehicle {
    String name;
    double speed;
    double position;

    void move() {
        position += speed;
    }

    void speedUp(double delta) {
        if (delta < 0) return; // 変化量が負の値であってはならない
        speed += delta;
    }

    void speedDown(double delta) {
        if (delta < 0) return; // 変化量が負の値であってはならない
        speed -= delta;
        if (speed < 0) {
            speed = 0;
        }
    }

    Vehicle(String name_) {
        name = name_;
        speed = 0;
        position = 0; // 初期位置が 0
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle("Car");
        car.move();
        System.out.println(car.position); // => 0.0
        car.speedUp(100);
        car.speedDown(30);
        car.move();
        car.move();
        System.out.println(car.position); // => 140.0
    }
}
