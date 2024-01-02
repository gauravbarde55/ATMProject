import java.util.Scanner;

public class Transfer {
    public static void performTransfer(Scanner scanner) {
        System.out.println("Enter the transfer amount: ");
        double amount = scanner.nextDouble();

        System.out.println("Enter the recipient's account number: ");
        String recipientAccount = scanner.next();

        // Placeholder logic for transfer
        System.out.println("Transferring $" + amount + " to account " + recipientAccount + "...");
    }
}
