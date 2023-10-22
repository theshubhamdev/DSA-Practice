package GreedyAlgorithms;

import java.util.Arrays;

public class MinAbsoluteDifferencePairs {
    public static int minimumAbsoluteDifference(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);
        int min = 0;
        for (int i = 0; i < b.length; i++) {
            min = min + Math.abs(a[i] - b[i]);
        }
        return min;
    }
    public static void main(String[] args) {
        int a[] = { 4, 1, 8, 7 };
        int b[] = { 2, 3, 5, 6 };
        System.out.println("Min Absolute Difference of pairs = " + minimumAbsoluteDifference(a, b));
    }
}
