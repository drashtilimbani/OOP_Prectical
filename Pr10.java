import java.util.Scanner;
public class pr10 {
    String account_holder_name;
    double balance;

    // Static variable (common for all accounts)
    static double interest_rate = 5.0; // 5% interest

    // Constructor
    BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    // Method to calculate interest
    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    // Method to display account details and interest
    void display() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interest_rate + "%");
        System.out.println("Interest Earned: " + calculateInterest());
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating two bank accounts
        BankAccount acc1 = new BankAccount("Alice", 10000);
        BankAccount acc2 = new BankAccount("Bob", 20000);

        // Display details
        acc1.display();
        acc2.display();
    }
}
