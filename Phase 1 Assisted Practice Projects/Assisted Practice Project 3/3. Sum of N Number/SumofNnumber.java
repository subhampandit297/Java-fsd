package dom;

import java.util.Scanner;

public class SumofNnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        // Input the range L and R
        System.out.print("Enter the range (L and R, where 0 <= L <= R <= n-1): ");
        int L = scanner.nextInt();
        int R = scanner.nextInt();

        // Input the elements of the array
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Calculate and display the sum in the specified range
        int sumInRange = calculateSumInRange(array, L, R);
        System.out.println("Sum of elements in the range [" + L + ", " + R + "]: " + sumInRange);

        scanner.close();
    }

    // Method to calculate the sum of elements in the range [L, R]
    private static int calculateSumInRange(int[] arr, int L, int R) {
        if (L < 0 || R >= arr.length || L > R) {
            // Invalid range, return -1 or handle accordingly
            System.out.println("Invalid range.");
            return -1; // Assuming -1 indicates an error
        }

        int sum = 0;
        for (int i = L; i <= R; i++) {
            sum += arr[i];
        }

        return sum;
    }
}

