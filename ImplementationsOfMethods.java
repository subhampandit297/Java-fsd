package com;

public class ImplementationsOfMethods {

    static void printMessage() {
        System.out.println("Hello.");
    }

    static int addNumbers(int a, int b) {
        return a + b;
    }

    static void displaySum(int x, int y) {
        int sum = x + y;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        printMessage();
        int result = addNumbers(5, 7);
        System.out.println("Result of adding numbers: " + result);
        displaySum(10, 20);
        int sumResult = addNumbers(3, 4) + addNumbers(1, 2);
        System.out.println("Sum of two sets of numbers: " + sumResult);
        displaySum(addNumbers(8, 9), 5);
    }
}

