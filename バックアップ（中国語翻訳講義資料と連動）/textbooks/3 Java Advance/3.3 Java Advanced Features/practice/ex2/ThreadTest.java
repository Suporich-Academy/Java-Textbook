package ex2;

public class ThreadTest {
    int count;

    ThreadTest() {
        count = 0;
    }

    synchronized void add() {
        count++;
    }

    synchronized void sub() {
        count--;
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadTest threadTest = new ThreadTest();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                threadTest.add();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                threadTest.add();
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                threadTest.sub();
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                threadTest.sub();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println(threadTest.count);
    }
}
