import java.util.Scanner;

public class ATMApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize and authenticate user
        UserAuthentication userAuth = new UserAuthentication();
        boolean isAuthenticated = userAuth.authenticateUser(scanner);

        if (isAuthenticated) {
            // User is authenticated, provide ATM functionalities
            int choice;

            do {
                // Display menu
                System.out.println("1. Transactions History");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer");
                System.out.println("5. Quit");

                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                // Perform the selected operation
                switch (choice) {
                    case 1:
                        TransactionsHistory.displayTransactionHistory();
                        break;
                    case 2:
                        Withdraw.performWithdrawal(scanner);
                        break;
                    case 3:
                        Deposit.performDeposit(scanner);
                        break;
                    case 4:
                        Transfer.performTransfer(scanner);
                        break;
                    case 5:
                        System.out.println("Exiting ATM. Thank you!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

            } while (choice != 5);
        } else {
            System.out.println("Authentication failed. Exiting ATM.");
        }

        // Close the scanner
        scanner.close();
    }
}