package dom;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        printArray(array);

        mergeSort(array);

        System.out.println("Array after Merge Sort:");
        printArray(array);
    }

    // Merge sort algorithm
    private static void mergeSort(int[] array) {
        int n = array.length;

        if (n > 1) {
            int mid = n / 2;
            int[] leftArray = new int[mid];
            int[] rightArray = new int[n - mid];

            // Populate left and right arrays
            for (int i = 0; i < mid; i++) {
                leftArray[i] = array[i];
            }
            for (int i = mid; i < n; i++) {
                rightArray[i - mid] = array[i];
            }

            // Recursively sort the left and right arrays
            mergeSort(leftArray);
            mergeSort(rightArray);

            // Merge the sorted left and right arrays
            merge(array, leftArray, rightArray);
        }
    }

    // Merge method to merge two sorted arrays
    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray, if any
        while (i < leftArray.length) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray, if any
        while (j < rightArray.length) {
            array[k] = rightArray[j];
            j++;
            k++;
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
