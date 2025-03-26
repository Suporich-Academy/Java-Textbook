package ex6;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LoginSystem system = new LoginSystem(scanner);
        system.start();

        scanner.close();
    }
}
