package com;

import java.util.Arrays;

public class ImplementationofArrays {

    public static void main(String[] args) {
        int[] arr = new int[5];
        initializeArray(arr);
        System.out.println("Array after initialization:");
        printArray(arr);
        insertElement(arr, 2, 10);
        System.out.println("\nArray after inserting 10 at index 2:");
        printArray(arr);
        deleteElement(arr, 3);
        System.out.println("\nArray after deleting element at index 3:");
        printArray(arr);
    }

    private static void initializeArray(int[] arr) {
        Arrays.fill(arr, 0);
    }

    private static void insertElement(int[] arr, int index, int value) {
        if (index >= 0 && index < arr.length) {
            arr[index] = value;
        } else {
            System.out.println("Index out of bounds. Cannot insert element.");
        }
    }

    private static void deleteElement(int[] arr, int index) {
        if (index >= 0 && index < arr.length) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
        } else {
            System.out.println("Index out of bounds. Cannot delete element.");
        }
    }

    private static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

