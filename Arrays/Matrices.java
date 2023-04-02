package Arrays;

public class Matrices {

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for (int i = endRow - 1; i > startRow; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

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

    public static void diagonalSum(int matrix[][]) {
        if (matrix.length != matrix[0].length) {
            System.out.println("m should be equal to n");
            return;
        }
        int sum = 0;
        
        // Base Approach O(n^2)
        
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[i].length; j++) {
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         }
        //         else if (i + j == matrix.length - 1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        
        // Better Approach O(n)
        for (int i = 0; i < matrix.length; i++) {
            // primary diagonal
            sum += matrix[i][i];
            // secondary diagonal
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println("Diagonal Sum = " + sum);
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
             };
        // int matrix[][] = { { 1, 2, 3, 4}, { 5, 6, 7, 8 } };
        // int matrix[][] = {
        //         { 1, 2, 3, 4 },
        //         { 5, 6, 7, 8 },
        //         { 9, 10, 11, 12 },
        //         { 13, 14, 15, 16 }
        // };
        // int matrix[][] = {
        //     { 1, 1, 1, 1 },
        //     { 5, 1, 1, 1 },
        //     { 9, 1, 1, 12 },
        //     { 1, 14, 15, 1 }
        // };
        // findElement(matrix, 10);
        // findMinAndMax(matrix);
        // printSpiral(matrix);
        diagonalSum(matrix);
    }
}
