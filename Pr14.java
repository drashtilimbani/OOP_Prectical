class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void openAccount() {
        System.out.println("Account Opened: " + accountHolderName);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    SavingAccount(int accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    void calculateInterest() {
        double interest = balance * 0.04;
        System.out.println("Saving Interest: " + interest);
    }
}

class FixedDepositAccount extends BankAccount {
    int years;

    FixedDepositAccount(int accNo, String name, double bal, int years) {
        super(accNo, name, bal);
        this.years = years;
    }

    void maturityAmount() {
        double amount = balance * Math.pow(1.06, years);
        System.out.println("Maturity Amount: " + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(101, "Amit", 5000);
        sa.openAccount();
        sa.deposit(1000);
        sa.withdraw(500);
        sa.checkBalance();
        sa.calculateInterest();

        FixedDepositAccount fa = new FixedDepositAccount(102, "Rahul", 10000, 2);
        fa.openAccount();
        fa.deposit(2000);
        fa.checkBalance();
        fa.maturityAmount();
    }
