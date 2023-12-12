package dom;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 25, 3, 42, 8, 17, 35, 12};
        int targetElement = 17;

        int index = linearSearch(array, targetElement);

        if (index != -1) {
            System.out.println("Element " + targetElement + " found at index " + index);
        } else {
            System.out.println("Element " + targetElement + " not found in the array");
        }
    }

    // Linear search algorithm
    private static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }
}

