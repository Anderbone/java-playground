package thread;

import static udemy.thread.ThreadColor.ANSI_BLUE;

public class MyThread extends Thread {
    public static synchronized void counterPlusOne() {
        count++;
    }

    public static int count = 0;

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "hello from another thread");
        for (int i = 0; i < 10000; i++) {
//            count++;
            counterPlusOne();
        }
    }

    public static void main(String[] args) {
        MyThread a1 = new MyThread();
        MyThread a2 = new MyThread();
        a1.start();
        try {
            a1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(MyThread.count);
        try {
            a2.start();
            a2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(MyThread.count);
    }
}
