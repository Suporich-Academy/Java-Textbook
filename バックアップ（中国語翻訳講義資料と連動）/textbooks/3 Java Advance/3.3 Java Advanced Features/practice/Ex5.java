import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex5 {
    static Map<String, String> users = new HashMap<>();
    static Scanner scanner;

    static boolean isUsernameValid(String username) {
        return username.matches("[a-zA-Z0-9]+");
    }

    static boolean isPasswordValid(String password) {
        return password.matches("[a-zA-Z0-9_]{8,}");
    }

    /**
     * ユーザー登録機能
     */
    static void register() {
        // 最初にユーザー名とパスワードを一度入力させる
        System.out.println("** Please input username and password to register: **");
        String username = scanner.next();
        String password = scanner.next();
        scanner.nextLine();
        while (true) {
            if (users.containsKey(username)) {
                // ユーザー名がすでに存在する場合は、再入力させる
                System.out.println("** The username '" + username + "' has been registered. **");
            } else if (!isUsernameValid(username) || !isPasswordValid(password)) {
                // ユーザー名またはパスワードの形式が正しくない場合は、再入力させる
                System.out.println("** Your input is not in right format! **");
            } else {
                // フォーマットが正しければ、入力が終了
                break;
            }

            // ユーザーに再入力を求める
            System.out.println("** Please input a username and a password again: **");
            username = scanner.next();
            password = scanner.next();
            scanner.nextLine();
        }

        // 登録に成功したら、ユーザーのリストを出力
        users.put(username, password);
        System.out.println("** Register successfully! **");
        System.out.println("** User list: " + users + ". **");
    }

    /**
     * ユーザーログイン機能
     */
    static void login() {
        // ユーザー名とパスワードの入力
        System.out.println("** Please input a username and a password to login: **");
        String username = scanner.next();
        String password = scanner.next();
        scanner.nextLine();

        if(users.containsKey(username)) { // ユーザー名がユーザーテーブルにある場合
            if(users.get(username).equals(password)) { // パスワードも正しい場合
                System.out.println("** Login successfully! Welcome, " + username + ". **");
            } else { // パスワードが正しくない場合
                System.out.println("** Wrong password. Login failed. **");
            }
        } else { // ユーザー名がユーザーテーブルにない場合
            System.out.println("** There is no such username: '" + username + "'. Login failed. **");
        }
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        String command;

        while (true) {
            // 最初にどの機能を選択するかを入力させる
            System.out.println("** Please select an action: register or login? **");
            command = scanner.next();
            scanner.nextLine();
            switch (command) {
                case "register":
                    register();
                    break;
                case "login":
                    login();
                    break;
                default:
                    System.out.println("** Unknown action: '" + command + "'. **");
            }
        }
    }
}
