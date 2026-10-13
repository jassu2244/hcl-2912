package Exception;

public class CustomException {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException(
                    "Age must be 18 or above"
            );
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Age verification completed");
        }

        System.out.println("Program continues normally");
    }
}
