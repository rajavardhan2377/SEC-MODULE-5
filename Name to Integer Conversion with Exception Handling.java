import java.util.Scanner;

public class NameConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            String firstThreeChars = name.substring(0, 3);
            int intValue = Integer.parseInt(firstThreeChars);
            System.out.println("Integer value of the first three characters: " + intValue);

        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Error: Name is too short. Cannot extract first three characters. " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error: First three characters cannot be converted to an integer. " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
