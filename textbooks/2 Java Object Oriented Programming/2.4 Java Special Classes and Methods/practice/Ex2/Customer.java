import java.util.Random;

public class Customer {
    private String name;
    private double cash;

    public Customer(String name, double cash) {
        this.name = name;
        this.cash = cash;
    }

    /**
     * 購入する商品をランダムに選択します。
     */
    public void go(Shop shop) {
        System.out.println(name + " went in " + shop.getName() + " with $ " + cash + ".");
        System.out.println(shop.getName() + ": Welcome to " + shop.getName() + "!" +
                " What are you looking for?");

        Random random = new Random();

        Product product = shop.getProducts()[random.nextInt(shop.getProductNumber())];
        System.out.println(name + ": I want to buy a " + product.getType() + ".");
        if (buy(shop, product)) {
            System.out.println(shop.getName() + ": Here your are!");
            System.out.println(name + " bought a " + product.getType() + ".");
        } else {
            System.out.println(shop.getName() + ": Sorry, you can't offer that!");
        }
        System.out.println("Now " + name + " has $ " + cash + ".");
        System.out.println(name + " went out of " + shop.getName() + ".");
        System.out.println();
    }

    /**
     * ショップから商品を購入します。
     *
     * @return 購入が成功した場合、<code>true</code> を、それ以外の場合は <code>false</code> を返します。
     */
    public boolean buy(Shop shop, Product product) {
        if (product.getPrice() <= this.cash) {
            this.cash -= product.getPrice();
            return true;
        }
        return false;
    }
}
