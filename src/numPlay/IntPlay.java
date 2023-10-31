package numPlay;

import java.util.Random;

public class IntPlay {
    public static void main(String[] args) {
//        randomPlay();
//        mathPlay();
        intPlay();
        int a1 = addPlay(1, 2);
//        int a2 = addPlay(1, 2, 3, 4);
        int a2 = addPlay(new int[]{1, 3, 5});
        System.out.println(a1);
        System.out.println(a2);
    }

    private static int addPlay(int... args) {
        int res = 0;
        for (int v: args){
            res += v;
        }
        return res;
    }

    private static void intPlay() {
        String s = Integer.toBinaryString(4);
        System.out.println(s);
    }

    private static void mathPlay() {
        double a = Math.log(2.7);
        System.out.println(a);
    }

    private static void randomPlay() {

        Random r = new Random();
        System.out.println(r.nextInt(3));
        System.out.println(r.nextInt(3));
        System.out.println(r.nextInt(3));
        System.out.println(r.nextInt(3));
    }
}
