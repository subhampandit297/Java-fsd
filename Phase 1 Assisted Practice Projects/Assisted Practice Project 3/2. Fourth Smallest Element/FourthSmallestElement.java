package dom;

import java.util.Arrays;

public class FourthSmallestElement {
    public static void main(String[] args) {
        // Input unsorted list
        int[] unsortedList = {12, 5, 8, 1, 7, 15, 10, 3, 6};

        // Find the fourth smallest element
        int fourthSmallest = findFourthSmallest(unsortedList);

        // Display the result
        System.out.println("Original Unsorted List: " + Arrays.toString(unsortedList));
        System.out.println("Fourth Smallest Element: " + fourthSmallest);
    }

    // Method to find the fourth smallest element in an unsorted list
    private static int findFourthSmallest(int[] arr) {
        if (arr.length < 4) {
            // Handle the case when the array has less than four elements
            System.out.println("Array has less than four elements.");
            return -1; // Assuming -1 indicates an error or not found
        }

        // Sort the array
        Arrays.sort(arr);

        // Return the fourth element (index 3 in a zero-based index)
        return arr[3];
    }
}

