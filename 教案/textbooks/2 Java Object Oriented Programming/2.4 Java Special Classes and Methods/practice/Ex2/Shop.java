public class Shop {
    private String name;
    private Product[] products;

    public Shop(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    public int getProductNumber() {
        return products.length;
    }
}
