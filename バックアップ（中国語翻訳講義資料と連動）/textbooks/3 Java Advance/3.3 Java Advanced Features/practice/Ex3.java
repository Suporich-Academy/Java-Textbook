public class Ex3 {
    static boolean isUsernameValid(String username) {
        return username.matches("[a-zA-Z0-9]+");
    }

    static boolean isPasswordValid(String password) {
        return password.matches("[a-zA-Z0-9_]{8,}");
    }

    public static void main(String[] args) {
        System.out.println(isUsernameValid("Alice1990")); // => true
        System.out.println(isUsernameValid("xyz-123")); // => false
        System.out.println(isUsernameValid("")); // => false
        System.out.println(isPasswordValid("abc_123_456")); // => true
        System.out.println(isPasswordValid("abcde")); // => false
        System.out.println(isPasswordValid("abcd.1234")); // => false
    }
}
