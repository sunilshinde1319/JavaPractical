package shinde;

public class BankAccount {
    // Data Members
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private double balance;

    // Constructor to assign initial values
    public BankAccount(String depositorName, String accountNumber, String accountType, double initialAmount) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialAmount;
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    // Method to withdraw an amount after checking the balance
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds! Cannot withdraw " + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            System.out.println("New Balance: " + balance);
        }
    }

    // Method to display name and balance
    public void displayInfo() {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
    	System.out.println("Welcome in Bank !");
        BankAccount account = new BankAccount("sunil shinde", "9527535063", "Savings", 50000.00);
        account.displayInfo();
        account.deposit(10000.00);
        account.withdraw(20000.00);
        account.displayInfo();
        
        System.out.println("Thank You for visiting !");
    }
}
