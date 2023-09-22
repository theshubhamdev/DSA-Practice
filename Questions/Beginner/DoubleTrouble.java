package Questions.Beginner;

public class DoubleTrouble {

    public static String Double(String x) {
        String n = "";
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if ( ch  == ' ') {
                n = n + ch;
            } else {
                n += ch;
                n += ch;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        // System.out.println(Double("String"));
        System.out.println(Double("Hello World!"));

    }
}
