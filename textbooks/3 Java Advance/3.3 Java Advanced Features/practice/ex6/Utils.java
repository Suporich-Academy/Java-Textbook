package ex6;

public class Utils {
    public static boolean isUsernameValid(String username) {
        return username.matches("[a-zA-Z0-9]+");
    }
    public static boolean isPasswordValid(String password) {
        return password.matches("[a-zA-Z0-9_]{8,}");
    }
}
