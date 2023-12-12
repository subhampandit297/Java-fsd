package dom;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {3, 8, 12, 17, 25, 35, 42};
        int targetElement = 17;

        int index = binarySearch(sortedArray, targetElement);

        if (index != -1) {
            System.out.println("Element " + targetElement + " found at index " + index);
        } else {
            System.out.println("Element " + targetElement + " not found in the array");
        }
    }

    // Binary search algorithm
    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

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

