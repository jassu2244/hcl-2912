
package Exception;

public class ExceptionExample {

    static void checkNumber() throws Exception {
        throw new Exception("Number cannot be negative");
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }
        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        // Checked Exception
        try {
            checkNumber();
        } catch (Exception e) {
            System.out.println("Checked Exception: " + e.getMessage());
        } finally {
            System.out.println("Checked exception block completed");
        }

        // Unchecked Exception
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e.getMessage());
        } finally {
            System.out.println("Unchecked exception block completed");
        }

        try {
            checkAge(16);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled: " + e.getMessage());
        } finally {
            System.out.println("Age verification completed");
        }

        System.out.println("Program continues normally");
    }
}
