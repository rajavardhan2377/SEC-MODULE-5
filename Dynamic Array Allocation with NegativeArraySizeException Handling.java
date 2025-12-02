import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the desired array size: ");
            int size = scanner.nextInt();

            int[] array = new int[size];
            System.out.println("Array of size " + array.length + " created successfully.");

        } catch (NegativeArraySizeException e) {
            System.err.println("Error: Array size cannot be negative. " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.err.println("Error: Invalid input. Please enter an integer for array size.");
        } finally {
            scanner.close();
        }
    }
}
