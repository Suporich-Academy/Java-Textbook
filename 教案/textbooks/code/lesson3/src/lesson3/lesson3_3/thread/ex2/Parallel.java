package lesson3.lesson3_3.thread.ex2;

public class Parallel {
    static int count;

    public static void main(String[] args) throws InterruptedException {
        // スレッドの作成
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                count++;
                System.out.println("スレッド１"+i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                count--;
                System.out.println("スレッド2"+i);
            }
        });

        // スレッドの実行を開始
        t1.start();
        t2.start();

        // スレッドが終了するのを待つ
        //コメントアウトすると計算する前に結果が出てしまうことを説明する
        t1.join();
        t2.join();

        System.out.println("合計値は"+count);
    }
}
