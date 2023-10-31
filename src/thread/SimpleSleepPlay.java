package thread;

public class SimpleSleepPlay {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
            System.out.println("catch you");
        }
        System.out.println("ahha");
    }
}
