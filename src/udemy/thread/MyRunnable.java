package udemy.thread;

import static udemy.thread.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    public static int count = 0;

    @Override
    public void run() {
        System.out.println(ANSI_RED + "hello from myrunablle");
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public static void main(String[] args) {

    }
}
