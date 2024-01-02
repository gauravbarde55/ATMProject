import java.util.Scanner;

public class UserAuthentication {
    public static boolean authenticateUser(Scanner scanner) {
        System.out.println("Enter your user ID: ");
        String userId = scanner.next();

        System.out.println("Enter your PIN: ");
        String pin = scanner.next();

        // Placeholder logic for user authentication
        // For simplicity, always return true for now
        System.out.println("Authentication successful!");
        return true;
    }
}
