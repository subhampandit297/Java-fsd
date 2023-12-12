package dom;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            methodWithThrows();
            methodWithThrow();
            methodWithCustomException();
        } catch (ArithmeticException e) {
            System.err.println("Caught ArithmeticException: " + e.getMessage());
        } catch (CustomException e) {
            System.err.println("Caught CustomException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }

    public static void methodWithThrows() throws ArithmeticException {
        int result = 10 / 0;
        System.out.println("Result: " + result);
    }

    public static void methodWithThrow() {
        throw new ArithmeticException("This is an ArithmeticException thrown using throw");
    }

    public static void methodWithCustomException() throws CustomException {
        throw new CustomException("This is a custom exception thrown using throw");
    }
}
