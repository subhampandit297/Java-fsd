package dom;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            // Code that may cause an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch and handle the specific exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Code that will always execute, whether an exception occurs or not
            System.out.println("Finally block executed");
        }

        System.out.println("Program continues after exception handling");
    }

    // A method that may throw an exception
    private static int divide(int dividend, int divisor) {
        // Attempting to divide by zero
        return dividend / divisor;
    }
}

