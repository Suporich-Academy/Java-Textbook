package enums;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Link");

        System.out.println("Test starts.");
        player.printInfo();
        player.move(Direction.UP);
        player.printInfo();
        player.move(Direction.LEFT_UP);
        player.move(Direction.LEFT_DOWN);
        player.move(Direction.STAY);
        player.printInfo();
    }
}
