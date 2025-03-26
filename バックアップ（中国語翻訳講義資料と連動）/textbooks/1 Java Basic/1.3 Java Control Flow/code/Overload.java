public class Overload {
    static int power(int a, int b) {
        int p = 1;
        for (int i = 0; i < b; i++) {
            p *= a;
        }
        return p;
    }

    // 異なるパラメータなので、オーバーロードできる
    static double power(double a, double b) {
        double p = 1;
        for (int i = 0; i < b; i++) {
            p *= a;
        }
        return p;
    }

    // 同じパラメータなので、オーバーロードできない
//    static String power(int a, int b) {
//        int p = 1;
//        for (int i = 0; i < b; i++) {
//            p *= a;
//        }
//        return "" + p;
//    }

    // 同じパラメータなので、オーバーロードできない
//    static int power(int x, int y) {
//        int p = 1;
//        for (int i = 0; i < y; i++) {
//            p *= x;
//        }
//        return p;
//    }

    public static void main(String[] args) {
        System.out.println(power(2, 3) + power(3, 4) + power(8, 5)); // => 32857
        System.out.println(power(2.0, 3.0) + power(3.0, 4.0) + power(8.0, 5.0)); // => 32857.0
    }
}
