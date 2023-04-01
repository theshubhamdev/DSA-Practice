// Question 1 : Write a Java program to get a number from the user and print whether it is positive or negative.

package ConditionalStatementsPractice;

import java.util.Scanner;

public class DetectPositiveNegativeQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Positive number");
        }
    }
}
