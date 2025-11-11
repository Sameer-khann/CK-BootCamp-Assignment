class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccountNew {
    private String accountHolder;
    private double balance;
    private static int totalAccounts = 0;  // Static variable to track total accounts

    public BankAccountNew(String accountHolder, double initialDeposit) throws InvalidAmountException {
        if (initialDeposit < 0) {
            throw new InvalidAmountException("Initial deposit can't be less then zero.");
        }
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
        totalAccounts++;
    }

    // Deposit method
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException(" amount must be greater then zero.");
        }
        balance += amount;
        System.out.println("Deposited : " + amount);
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive!");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance! Cannot withdraw " + amount);
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount);
    }


    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Current Balance : " + balance);
    }
}

// Driver class
public class Task9 {
    public static void main(String[] args) {
        try {
            BankAccountNew acc1 = new BankAccountNew("Samir", 5000);
            acc1.deposit(1500);
            acc1.withdraw(2000);
            acc1.displayAccountInfo();

            BankAccountNew acc2 = new BankAccountNew("Rohit", 10000);
            acc2.withdraw(12000);
            acc2.displayAccountInfo();

        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Error : " + e);
        }

        System.out.println("Total Accounts Created : " + BankAccountNew.getTotalAccounts());
    }
}
