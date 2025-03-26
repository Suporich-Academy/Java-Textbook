public class Vehicle {
    String name;  // 名前
    double speed; // 速度

    /**
     * 移動
     */
    void move() { }

    /**
     * 速度をあげる
     */
    void speedUp(double delta) { }

    /**
     * 速度をさげる
     */
    void speedDown(double delta) { }

    /**
     * コンストラクタは、名前を設定して、速度を 0 に設定する
     */
    Vehicle(String name_) {
        name = name_;
        speed = 0;
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle("Car");
        Vehicle bike = new Vehicle("Bike");
        System.out.println(car.name); // => Car
        System.out.println(bike.speed); // => 0.0
    }
}
