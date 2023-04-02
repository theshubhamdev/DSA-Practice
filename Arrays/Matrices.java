package Arrays;

public class Matrices {

    public static void findElement(int matrix[][], int element) {
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (element == matrix[i][j]) {
                    System.out.println("Element found at (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }

    public static void findMinAndMax(int matrix[][]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                max = Math.max(max, matrix[i][j]);
                min = Math.min(min, matrix[i][j]);
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        // findElement(matrix, 10);
        findMinAndMax(matrix);
    }
}
