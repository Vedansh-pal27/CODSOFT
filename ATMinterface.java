import java.util.Scanner;
class BankAccount {
    protected String accountHolderName;
    protected double balance;
    // Constructor
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew:" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } 
    }
    // Check balance method
    public double checkBalance() {
        return balance;
    }
}
class ATM extends BankAccount {
    // Constructor
    public ATM(String accountHolderName, double initialBalance) {
        super(accountHolderName, initialBalance);
    }
    public void displayMenu() {
        System.out.println("Welcome, " + accountHolderName + "!");
        System.out.println("Please select an option:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }
}
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create an ATM object (which also acts as a BankAccount)
        ATM atm = new ATM("Vedansh pal", 10000.0);
        boolean exit = false;
        while (!exit) {
            atm.displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            double amount = 0;
            if (choice == 1) {
                System.out.print("Enter amount: ");
                amount = scanner.nextDouble();
                atm.withdraw(amount);
                break;
            }
            else if(choice == 2){
                System.out.print("Enter amount: ");
                amount= scanner.nextDouble();
                atm.deposit(amount);
                break;
            }
            else if (choice == 4) {
                exit = true;
            } else {
                System.out.println("Your current balance is: " + atm.checkBalance());
                break;
            }
        }

    }
}
