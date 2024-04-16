import java.util.Scanner;

public class TransactionManager {
    public static void deposit(AccountBank account, double amount) {
        if (amount > 0) {
            account.deposit(amount);
        } else {
            System.out.println("Số tiền gửi không hợp lệ.");
        }
    }

    public static void withdraw(AccountBank account, double amount) {
        if (amount > 0) {
            account.withdraw(amount);
        } else {
            System.out.println("Số tiền rút không hợp lệ.");
        }
    }

    public static void transfer(AccountBank sourceAccount, Scanner scanner, double amount) {
        if (amount > 0) {
            System.out.println("Nhập số tài khoản đích:");
            String destinationAccountNumber = scanner.next();

            // Tạo một tài khoản đích mới
            AccountBank destinationAccount = new AccountBank();
            destinationAccount.setAccountNumber(destinationAccountNumber);

            System.out.println("Nhập tên chủ tài khoản đích:");
            String destinationAccountHolderName = scanner.next();
            destinationAccount.setAccountHolderName(destinationAccountHolderName);

            sourceAccount.transfer(destinationAccount, amount);
        } else {
            System.out.println("Số tiền chuyển khoản không hợp lệ.");
        }
    }
}
