public class Vehicle {
    String name;
    double speed;
    double position;

    void move() {
        position += speed;
    }

    void speedUp(double delta) {
        if (delta < 0) return;
        speed += delta;
    }

    void speedDown(double delta) {
        if (delta < 0) return;
        speed -= delta;
        if (speed < 0) {
            speed = 0;
        }
    }

    void print() {
        // 空白のまま、サブクラスでオーバーライド
    }

    Vehicle(String name_) {
        name = name_;
        speed = 0;
        position = 0;
    }
}
