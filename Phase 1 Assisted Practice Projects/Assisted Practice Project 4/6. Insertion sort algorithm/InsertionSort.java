package dom;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        printArray(array);

        insertionSort(array);

        System.out.println("Array after Insertion Sort:");
        printArray(array);
    }

    // Insertion sort algorithm
    private static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements that are greater than key to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            // Place the key at its correct position in the sorted part of the array
            array[j + 1] = key;
        }
    }

    // Utility method to print the elements of the array
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

