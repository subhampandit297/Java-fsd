package dom;

public class ExponentialSearch {
    public static void main(String[] args) {
        int[] array = {3, 8, 12, 17, 25, 35, 42};
        int targetElement = 17;

        int index = exponentialSearch(array, targetElement);

        if (index != -1) {
            System.out.println("Element " + targetElement + " found at index " + index);
        } else {
            System.out.println("Element " + targetElement + " not found in the array");
        }
    }

    // Exponential search algorithm
    private static int exponentialSearch(int[] array, int target) {
        int size = array.length;
        
        // If the target is at the first position
        if (array[0] == target) {
            return 0;
        }

        // Find the range for binary search by doubling the index
        int i = 1;
        while (i < size && array[i] <= target) {
            i *= 2;
        }

        // Perform binary search in the identified range
        return binarySearch(array, target, i / 2, Math.min(i, size - 1));
    }

    // Binary search algorithm within a specified range
    private static int binarySearch(int[] array, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Element found, return its index
            } else if (array[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found
    }
}
