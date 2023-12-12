package dom;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch block for ArithmeticException
            System.err.println("Error: " + e.getMessage());
        } finally {
            // Optional finally block, executed regardless of whether an exception occurred or not
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }

    // A method that may throw an ArithmeticException
    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
