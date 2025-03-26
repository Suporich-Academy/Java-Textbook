package account;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.username = "Alice";
//        user.password = "123"; // error
        user.getCash();
//        user.getPassword(); // error
    }
}
