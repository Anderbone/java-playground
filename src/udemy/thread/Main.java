package udemy.thread;

import static udemy.thread.ThreadColor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hi from main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== another thread ==");
        anotherThread.start();
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hi from anonymous class thread");
            }
        }.start();
        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hi from anonymous class's impl of run()");
                try {
                    anotherThread.join();
                    System.out.println(ANSI_RED + "AnotheThread terminated , so i'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all, I was interrupted");
                    throw new RuntimeException(e);
                }

            }
        });
        myRunnableThread.start();
        System.out.println(ANSI_PURPLE + "Hi again from main");

        MyRunnable r1 = new MyRunnable();
        MyRunnable r2 = new MyRunnable();
        r1.run();
        r2.run();
        System.out.println(MyRunnable.count);

    }
}
