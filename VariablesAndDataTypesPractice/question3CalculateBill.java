// Question 3: Enter cost of 3 items from the user (using float data type) -a pencil, a pen and an eraser.
//  You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
package VariablesAndDataTypesPractice;

import java.util.*;

public class question3CalculateBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost of the pencil");
        float costOfPencil = sc.nextFloat();

        System.out.println("Enter the cost of the pen");
        float costOfPen = sc.nextFloat();

        System.out.println("Enter the cost of the eraser");
        float costOfEraser = sc.nextFloat();

        float bill = costOfPencil + costOfPen + costOfEraser;
        float billWithGST = bill + bill * 18 / 100;
        System.out.println("The bill without GST is " + bill);
        System.out.println("The bill with GST is " + billWithGST);
    }
}
