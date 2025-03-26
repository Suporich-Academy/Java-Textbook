package login;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username, password;
        
        System.out.println("Welcom to the login system.");
        
        final AccountRepository repository = new AccountRepositoryImpl();
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please input your username:");
            username = scanner.nextLine();
            System.out.println("Please input your password:");
            password = scanner.nextLine();
            
            repository.findAccountByUsername(username).ifPresentOrElse(account -> {
                if (account.getPassword().equals(password)) {
                    System.out.println("Logged in successfully! Welcome back, " + username + ".");                    
                } else {
                    System.out.println("Wrong password!");
                }
            }, () -> {
                System.out.println("There is no such username: '" + username + "'.");
            });
        }
        
        repository.close();
    }
}
