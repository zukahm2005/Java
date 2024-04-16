import java.util.Scanner;

public class AccountBank {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor with default values
    public AccountBank() {
        this.accountNumber = "";
        this.accountHolderName = "";
        this.balance = 0.0;
    }

    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Số dư không thể là số âm.");
        }
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Số tài khoản: " + accountNumber);
        System.out.println("Tên chủ tài khoản: " + accountHolderName);
        System.out.println("Số dư: " + balance);
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " đã được gửi thành công.");
        } else {
            System.out.println("Số tiền gửi không hợp lệ.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(amount + " đã được rút thành công.");
            } else {
                System.out.println("Số dư không đủ.");
            }
        } else {
            System.out.println("Số tiền rút không hợp lệ.");
        }
    }

    // Method to transfer money from this account to another account
    public void transfer(AccountBank destinationAccount, double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                destinationAccount.deposit(amount);
                System.out.println(amount + " đã được chuyển thành công đến tài khoản " + destinationAccount.getAccountNumber());
            } else {
                System.out.println("Số dư không đủ để chuyển khoản.");
            }
        } else {
            System.out.println("Số tiền chuyển khoản không hợp lệ.");
        }
    }
}
