package dom;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        System.out.println("Pushing elements onto the stack:");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Displaying the stack
        displayStack(stack);

        // Popping elements from the stack
        System.out.println("\nPopping elements from the stack:");
        int poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);

        // Displaying the stack after popping
        displayStack(stack);
    }

    // Method to display the elements of the stack
    private static void displayStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.print("Stack: ");
        for (int element : stack) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

