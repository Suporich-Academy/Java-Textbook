import java.util.Random;

public class Market {
    private String name;
    private Shop[] shops;
    private Customer[] customers;

    public Market(String name, Shop[] shops, Customer[] customers) {
        this.name = name;
        this.shops = shops;
        this.customers = customers;
    }

    /**
     * お客様と店舗をランダムに選んで、交易を行います。
     */
    public void tryTrade() {
        // 乱数の生成のために使われるオブジェクト
        Random random = new Random();

        // お客様をランダムに選ぶ
        Customer customer = customers[random.nextInt(customers.length)];

        // 店舗をランダムに選ぶ
        Shop shop = shops[random.nextInt(shops.length)];

        customer.go(shop);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "a market with " +
                shops.length + " shops and " +
                customers.length + " customers";
    }
}
