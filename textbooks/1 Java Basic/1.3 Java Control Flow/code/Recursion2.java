public class Recursion2 {
    static int f(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
	
    public static void main(String[] args) {
        int n = 10;
        System.out.println("f(" + n + ") = " + f(n)); // => f(10) = 55
    }
}
