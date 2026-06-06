package Asgnpract.Inheritance;

class Account {
    String accountNumber;
    String holderName;

    Account(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    void showDetails() {
        System.out.println("Account No  : " + accountNumber);
        System.out.println("Holder Name : " + holderName);
    }
}

public class INH5_SavingsAccount extends Account {
    double balance;
    double interestRate;

    INH5_SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName);
        this.balance = balance;
        this.interestRate = interestRate;
    }

    double calculateInterest() {
        return balance * interestRate / 100;
    }

    void showSavingsDetails() {
        showDetails();
        System.out.println("Balance       : Rs " + balance);
        System.out.println("Interest Rate : " + interestRate + "%");
        System.out.println("Interest Earned: Rs " + calculateInterest());
    }

    public static void main(String[] args) {
        INH5_SavingsAccount sa = new INH5_SavingsAccount("SB1001", "Amit", 50000, 4.5);
        sa.showSavingsDetails();
    }
}
