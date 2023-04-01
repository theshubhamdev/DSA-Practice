package codeAThon;

import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void reverseArray(int n, int arr[]) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void OddDigitsSum(int n) {
        int i = 0;
        int sum = 0;
        while (n != 0) {
            i++;
            int x = n % 10;
            if (i % 2 == 1) {
                sum += x;
            }
        }
        System.out.print(sum);
    }

    public static void SecondLargestNumber(int arr[]) {
        Arrays.sort(arr);
        System.out.print(arr[arr.length - 2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(n, arr);
    }
}
