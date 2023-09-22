package Questions.Beginner;

public class MyHouse {

    public static int myHouse(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 6;
        }
        return (n * 5 )+ 1;
    }
    public static void main(String[] args) {
        System.out.println(myHouse(87));
    }
}
