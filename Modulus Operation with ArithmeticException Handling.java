import java.util.Scanner;

public class ModulusOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            if (num2 == 0) {
                throw new ArithmeticException("Cannot perform modulus operation by zero.");
            }

            int result = num1 % num2;
            System.out.println("Result of modulus operation: " + result);

        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.err.println("Error: Invalid input. Please enter integers only.");
        } finally {
            scanner.close();
        }
    }
}
