public class Label {
    public static void main(String[] args) {
        // ラベル（label）を使用しない
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i + ", " + j);
                if (j == 2) {
                    break;
                }
            }
        }

        System.out.println("-----");

        // ラベル（label）を使用する
        outer: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i + ", " + j);
                if (j == 2) {
                    break outer;
                }
            }
        }
    }
}
