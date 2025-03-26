public class Test {
    public static void main(String[] args) {
        Shop shop1 = new Shop("Cheapest", new Product[] {
                new Product("tomato", 4.0),
                new Product("banana", 3.0),
                new Product("pumpkin", 5.0),
        });
        Shop shop2 = new Shop("Newton", new Product[] {
                new Product("television", 1000.0),
                new Product("cell phone", 500.0),
                new Product("fan", 100.0)
        });

        Customer customer1 = new Customer("Alice", 50.0);
        Customer customer2 = new Customer("Bob", 1500.0);
        Customer customer3 = new Customer("Scrooge", 9999999.99);

        Market market = new Market(
                "LolMart",
                new Shop[] {shop1, shop2},
                new Customer[] {customer1, customer2, customer3}
        );

        System.out.println("This is a day in market \"" + market.getName() + "\", " + market + ".");
        for (int i = 0; i < 10; i++) {
            market.tryTrade();
        }
    }
}
