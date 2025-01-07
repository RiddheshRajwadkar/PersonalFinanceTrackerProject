import java.util.*;

public class Personal_Finance_Tracker {
    Scanner scanner = new Scanner(System.in);
    TransactionManager manager = new TransactionManager();

        public void start() {
            while (true) {
                System.out.println("\n Welcome to Personal Finance Tracker!");
                System.out.println("1. Add Income");
                System.out.println("2. Add Expense");
                System.out.println("3. View Transaction History");
                System.out.println("4. View Summary");
                System.out.println("5. Exit");
                System.out.println("Select an option");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the income amount: ");
                        double incomeAmount = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Enter the income description: ");
                        String incomeDescription = scanner.nextLine();
                        manager.addTransaction("Income", incomeAmount, incomeDescription);
                        break;
                    case 2:
                        System.out.println("Enter the expense amount: ");
                        double expenseAmount = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Enter the expense description: ");
                        String expenseDescription = scanner.nextLine();
                        manager.addTransaction("Expense", expenseAmount, expenseDescription);
                        break;
                    case 3:
                        manager.viewTransactions();
                        break;

                    case 4:
                        manager.viewSummary();
                        break;

                    case 5:
                        System.out.println("Exiting... Goodbye");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again");
                }
            }
        }
}