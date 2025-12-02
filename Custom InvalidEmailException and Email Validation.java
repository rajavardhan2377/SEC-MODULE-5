import java.util.Scanner;

// Custom Exception Class
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your email address: ");
            String email = scanner.nextLine();

            validateEmail(email);
            System.out.println("Email address is valid.");

        } catch (InvalidEmailException e) {
            System.err.println("Validation Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Email address must contain an '@' symbol.");
        }
    }
}
