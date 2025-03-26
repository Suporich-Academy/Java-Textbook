package lesson3.lesson3_3.thread.ex1;

public class MultiThread {
    public static void main(String[] args) {
        // スレッド 1 の作成
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Print in Thread 1");
                try {
                    Thread.sleep(160); // 100ms（0.1 秒）待つ
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // スレッド 2 の作成
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Print in Thread 2");
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // スレッドの実行を開始
        t1.start();
        t2.start();
    }
}