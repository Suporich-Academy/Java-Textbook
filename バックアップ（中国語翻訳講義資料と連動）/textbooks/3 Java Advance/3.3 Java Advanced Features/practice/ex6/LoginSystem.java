package ex6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginSystem {
    private final Map<String, User> users = new HashMap<>();
    private final Scanner scanner;

    public LoginSystem(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * ユーザー登録機能
     */
    private void register() {
        // 最初にユーザー名とパスワードを一度入力させる
        System.out.println("** Please input a username and a password to register: **");
        String username = scanner.next();
        String password = scanner.next();
        scanner.nextLine();

        while (true) {
            if (users.containsKey(username)) {
                // ユーザー名がすでに存在する場合は、再入力させる
                System.out.println("** The username '" + username + "' has been registered. **");
            } else if (!Utils.isUsernameValid(username) || !Utils.isPasswordValid(password)) {
                // ユーザー名またはパスワードの形式が正しくない場合、再入力させる
                System.out.println("** Your input is not in right format! **");
            } else {
                // フォーマットが正しければ、質問と回答を入力させる
                break;
            }

            // ユーザーに再入力を求める
            System.out.println("** Please input a username and a password again: **");
            username = scanner.next();
            password = scanner.next();
            scanner.nextLine();
        }

        // 質問と回答を入力させる
        System.out.println("** Please input a question: **");
        String question = scanner.nextLine();
        System.out.println("** Please input the answer to it: **");
        String answer = scanner.nextLine();
        while (true) {
            if (question.isEmpty() || answer.isEmpty()) {
                // 質問または回答が空の場合、再入力させる
                System.out.println("** The question and the answer should not be empty. **");
            } else {
                // フォーマットが正しければ、ユーザー情報の格納を開始する
                break;
            }

            // ユーザーを再入力させる
            System.out.println("** Please input a question and the answer again: **");
            question = scanner.next();
            answer = scanner.next();
            scanner.nextLine();
        }

        // 登録に成功したら、ユーザー一覧を出力
        users.put(username, new User(username, password, question, answer));
        System.out.println("** Register successfully! **");
        System.out.println("** User list: " + users + ". **");
    }

    /**
     * ユーザーログイン機能
     */
    private void login() {
        // ユーザー名とパスワードを入力させる
        System.out.println("** Please input the username and the password to login: **");
        String username = scanner.next();
        String password = scanner.next();
        scanner.nextLine();

        if(users.containsKey(username)) { // ユーザー名がユーザーテーブルの中にある場合
            if(users.get(username).getPassword().equals(password)) { // パスワードも正しい場合
                System.out.println("** Login successfully! Welcome, " + username + ". **");
            } else { // パスワードが正しくない場合は、質問に答えさせる
                System.out.println("** Wrong password. Please answer the question: **");
                System.out.println(">> Question: " + users.get(username).getQuestion() + " <<");
                String answer = scanner.nextLine();
                if (users.get(username).getAnswer().equals(answer)) {
                    // ユーザーが正しい回答を入力したら、パスワードの再設定を始める
                    System.out.println("** The answer is correct. Please input the new password: **");
                    password = scanner.next();
                    scanner.nextLine();

                    while (true) {
                        if (Utils.isPasswordValid(password)) {
                            // パスワードが正しい形式であれば、パスワードを変更して終了
                            users.get(username).setPassword(password);
                            break;
                        } else {
                            // パスワードの形式が正しくない場合は再入力させる
                            System.out.println("** Your input is not in right format! **");
                            System.out.println("** Please input the new password: **");
                            password = scanner.next();
                            scanner.nextLine();
                        }
                    }
                    System.out.println("** Change the password successfully! **");
                    System.out.println("** User list: " + users + ". **");
                } else {
                    // ユーザーが間違った回答を入力したら、ログインが失敗して終了
                    System.out.println("** The answer is wrong. Login failed. **");
                }
            }
        } else { // ユーザー名がユーザーテーブルにない場合
            System.out.println("** There is no such username: '" + username + "'. Login failed. **");
        }
    }

    /**
     * ユーザーが終了コマンドを入力するまで、ユーザーとのやりとりを開始する
     */
    public void start() {
        String command;

        while (true) {
            // まず、どの機能を選択するかを入力してもらう
            System.out.println("** Please select an action: register or login. Type end to terminate the system. **");
            command = scanner.next();
            scanner.nextLine();
            switch (command) {
                case "register":
                    register();
                    break;
                case "login":
                    login();
                    break;
                case "end":
                    System.out.println("** Thank you for using the system. **");
                    return;
                default:
                    System.out.println("** Unknown action: '" + command + "'. **");
            }
        }
    }
}
