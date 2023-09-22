// Problem
// Create a function addBefore that takes any number as an argument.
// The function should then add up all the numbers from 1 to the number you passed in the function.

// Examples:

// addBefore(5) ➞ 15
// 1 + 2 + 3 + 4 + 5 = 15

// addBefore(2) ➞ 3
// 1 + 2 = 3

// addBefore(897) ➞ 402753
// 1 + 2 + 3... + 897 = 402753

// Test Values to Pass:

// Test.(addBefore(1), 1)
// Test.(addBefore(4), 10)
// Test.(addBefore(13), 91)
// Test.(addBefore(392), 77028)
// Test.(addBefore(53), 1431)
// Test.(addBefore(897), 402753)
// Test.(addBefore(1000), 500500)
// Test.(addBefore(738), 272691)

package Questions.Beginner;

public class addAllBefore {

    public static int addAllBef(int n) {
        int sum = 0;
        for (int i = n; i >= 1; i--) {
            sum += i;
        }
        return sum;
    }

    public static int addAllBef2(int n) {
        return (n * (n + 1)) / 2;
    }

    public static int addAllBef3(int n) {
        if (n == 1)
            return 1;
        return n + addAllBef3(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(addAllBef2(738));
    }
}
