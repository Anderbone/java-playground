package stringPlay;

public class StringPlayGround {
    public static void main(String[] args) {
//        pureString();
//        playStringBuilder();
        playFormat();

    }

    private static void playFormat() {
        String str1 = "a1234";
        String str2 = "b1234";
        int int1 = 5;
        double double1 = 2.4d;
        String c1 = String.format("haha %s what %s the number %d, %.2f", str1, str2, int1, double1);
//        System.out.println(c1);
        String myString = """
            ni hao your name {%s} is 
            beautiful!
        """;
        System.out.println(myString.formatted("Jiyu"));
    }

    private static void playStringBuilder() {
        StringBuilder sb = new StringBuilder("eee");
        sb.append("abc");
        sb.append("1");
        sb.append("c");
        sb.reverse();
        sb.setCharAt(0, '$'); // replace
        sb.insert(sb.length(), '$'); // append
        sb.deleteCharAt(0);
        sb.deleteCharAt(1);
        sb.deleteCharAt(2);
        System.out.println(sb);
    }

    public static void pureString(){
        String s = "abcddde";
        s = s.replace("dd", "$");
        System.out.println(s);
    }
}
