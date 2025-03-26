package car;

public class Car {
    private int price;

    public Car(int price_) {
        setPrice(price_);
    }

    public int getPrice() {
        return price;
    }

    private void setPrice(int price_) {
        price = price_;
    }
}
