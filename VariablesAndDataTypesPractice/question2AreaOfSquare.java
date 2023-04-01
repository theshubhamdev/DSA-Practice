// Question 2: In a program, input the side of a square. You have to output the area of the square.
// (Hint : area of a square is (side x side))
package VariablesAndDataTypesPractice;

import java.util.Scanner;

public class question2AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area of square " + area);
    }
}
