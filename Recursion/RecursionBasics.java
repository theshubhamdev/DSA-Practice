package Recursion;

public class RecursionBasics {

    public static void printDecreasing(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n - 1);
    }

    public static void printIncreasing(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printIncreasing(n - 1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sumNaturalNum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNaturalNum(n - 1);
    }

    public static int findFabonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return findFabonacci(n - 1) + findFabonacci(n - 2);
    }

    public static boolean isSorted(int array[], int i) {
        if (i == (array.length - 1)) {
            return true;
        }
        if (array[i] > array[i + 1]) {
            return false;
        }
        return isSorted(array, i + 1);
    }

    public static int firstOccurence(int array[], int num, int i) {
        if (array.length - 1 == i) {
            return -1;
        }
        if (array[i] == num) {
            return i;
        }
        return firstOccurence(array, num, i + 1);
    }

    public static void main(String[] args) {
        int n = 5;
        // int arr[] = { 1, 2, 3, 4, 5 };
        int arr[] = { 1, 2, 5, 4, 5 };
        // printDecreasing(n);
        // printIncreasing(n);
        // System.out.println(factorial(n));
        // System.out.println(sumNaturalNum(n));
        // System.out.println(findFabonacci(n));
        // System.out.println(isSorted(arr, 0));
        System.out.println(firstOccurence(arr, n, 0));
    }
}
