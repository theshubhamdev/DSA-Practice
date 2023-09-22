// Problem
// Create a function smallBig that takes an array of numbers and,
// in order, returns both the min and max numbers.

// Examples:

// smallBig([1, 2, 3, 4, 5, 8]) ➞ [1, 8]

// smallBig([2372, 5]) ➞ [5, 2372]

// smallBig([4]) ➞ [4, 4]

// Test Values to Pass:

// Test.(smallBig([14, 35, 6, 1, 34, 54]), [1, 54])
// Test.(smallBig([1.346, 1.6532, 1.8734, 1.8723]), [1.346, 1.8734])
// Test.(smallBig([0.432, 0.874, 0.523, 0.984, 0.327, 0.2345]), [0.2345, 0.984])
// Test.(smallBig([13, 72, 98, 43, 24, 65, 31]), [13, 98])
// Test.(smallBig([-54, -23, -54, -21]), [-54, -21])
// Test.(smallBig([-0.473, -0.6834, -0.1287, 0.5632]), [-0.6834, 0.5632])
// Test.(smallBig([0, 0, 0, 0]), [0, 0])

package Questions.Beginner;

public class SmallBig {

    public static int[] smallBig(int arr[]) {
        int[] minMax = new int[2];
        if (arr.length == 0) {
            return minMax;
        }
        minMax[0] = arr[0];
        minMax[1] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            minMax[0] = Math.min(arr[i], minMax[0]);
            minMax[1] = Math.max(arr[i], minMax[1]);
        }
        return minMax;
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4, 5, 8 };
        // int arr[] = { 2372, 5};
        int arr[] = { 1 };
        System.out.println("[" + smallBig(arr)[0] + ", " + smallBig(arr)[1] + "]");
    }
}
