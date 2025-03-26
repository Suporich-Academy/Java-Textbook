public class For {
    public static void main(String[] args) {
        // 0 1 2 3 4
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("-----");

        // 0 2 4 6 8 10
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("-----");

        // 10 9 8 7 6 5 4 3 2 1 0
        for (int i = 10; i >=0 ; i -= 1) {
            System.out.println(i);
        }
    }
}
