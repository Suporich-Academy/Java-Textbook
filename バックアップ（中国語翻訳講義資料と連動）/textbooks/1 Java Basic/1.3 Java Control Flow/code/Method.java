public class Method {

    /**
     * a の b 乗を計算する
     */
    static int power(int a, int b) {
        int p = 1;
        for (int i = 0; i < b; i++) {
            p *= a;
        }
        return p;
    }

    /**
     * "Hello, [s]!" を画面に表示する
     */
    static void greet(String s) {
        System.out.println("Hello, " + s + "!");
    }

    public static void main(String[] args) {
        System.out.println(power(2, 3) + power(3, 4) + power(8, 5)); // => 32857
        greet("Tom"); // => Hello, Tom!
        greet("Jerry"); // => Hello, Jerry!
    }
}
