public class Parallel {
    static int count;

    public static void main(String[] args) throws InterruptedException {
        // スレッドの作成
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                count++;
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                count--;
            }
        });

        // スレッドの実行を開始
        t1.start();
        t2.start();

        // スレッドが終了するのを待つ
        t1.join();
        t2.join();

        System.out.println(count);
    }
}
