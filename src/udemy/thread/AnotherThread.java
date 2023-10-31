package udemy.thread;

import static udemy.thread.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {
    public static synchronized void counterPlusOne(){
        count++;
    }
    public static int count = 0;

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Another thread woke me up");
            return;
        }
        System.out.println(ANSI_BLUE + "3 seconds have passed and I'm awake");
    }

}
