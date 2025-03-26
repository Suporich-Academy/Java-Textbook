import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int i = scanner.nextInt();
            String s = scanner.next();
            scanner.nextLine();
            double d = scanner.nextDouble();

            System.out.println(i);
            System.out.println(s);
            System.out.println(d);
        }
    }
}
