public class DoWhile {
    public static void main(String[] args) {
        int i = 0;

        // 0 1 2 3 4
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);

        System.out.println("-----");

        // 5
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
    }
}
