package dom;

public class RightRotateArray {
    public static void main(String[] args) {
        // Input array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Number of steps to right rotate
        int steps = 5;

        System.out.println("Original Array:");
        printArray(array);

        // Right rotate the array
        rightRotateArray(array, steps);

        System.out.println("\nArray after Right Rotation by " + steps + " steps:");
        printArray(array);
    }

    // Method to right rotate an array by 'steps' steps
    private static void rightRotateArray(int[] arr, int steps) {
        int length = arr.length;
        steps = steps % length; // Handle cases where steps are greater than array length

        reverseArray(arr, 0, length - 1); // Reverse the whole array
        reverseArray(arr, 0, steps - 1); // Reverse the first 'steps' elements
        reverseArray(arr, steps, length - 1); // Reverse the remaining elements
    }

    // Method to reverse an array or a portion of an array
    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices toward each other
            start++;
            end--;
        }
    }

    // Method to print an array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

