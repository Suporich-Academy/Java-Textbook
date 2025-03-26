package login;

import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        String username, password;
        
        System.out.println("Welcom to the register system.");
        
        final AccountRepository repository = new AccountRepositoryImpl();
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please input a username:");
            username = scanner.nextLine();
            System.out.println("Please input a password:");
            password = scanner.nextLine();
            
            if (repository.findAccountByUsername(username).isPresent()) {
                System.out.println("The username '" + username + "' has been used.");
            } else {
                repository.save(new Account(username, password));
                System.out.println("Registered successfully! Nice to meet you, " + username + "!");
            }
        }
        
        repository.close();
    }
}
