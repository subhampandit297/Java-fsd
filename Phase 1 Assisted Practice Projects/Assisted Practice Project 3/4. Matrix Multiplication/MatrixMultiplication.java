package dom;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the matrices
        System.out.print("Enter the number of rows for matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix A: ");
        int colsA = scanner.nextInt();

        System.out.print("Enter the number of rows for matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix B: ");
        int colsB = scanner.nextInt();

        // Check if matrix multiplication is possible
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible. Number of columns in A must be equal to the number of rows in B.");
            return;
        }

        // Input elements for matrix A
        System.out.println("Enter elements for matrix A:");
        int[][] matrixA = inputMatrix(rowsA, colsA, scanner);

        // Input elements for matrix B
        System.out.println("Enter elements for matrix B:");
        int[][] matrixB = inputMatrix(rowsB, colsB, scanner);

        // Multiply matrices
        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        // Display the result matrix
        System.out.println("Resultant Matrix (A * B):");
        displayMatrix(resultMatrix);

        scanner.close();
    }

    // Method to input elements for a matrix
    private static int[][] inputMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    // Method to multiply two matrices
    private static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        int[][] resultMatrix = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return resultMatrix;
    }

    // Method to display a matrix
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

