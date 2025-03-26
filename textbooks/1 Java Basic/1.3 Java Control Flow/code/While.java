public class While {
    public static void main(String[] args) {
        int i = 0;

        // 0 1 2 3 4
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("-----");

        // 何も出力しない
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}
