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
        return findFabonacci(n-1) + findFabonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        // printDecreasing(n);
        // printIncreasing(n);
        // System.out.println(factorial(n));
        // System.out.println(sumNaturalNum(n));
        System.out.println(findFabonacci(n));
    }
}
