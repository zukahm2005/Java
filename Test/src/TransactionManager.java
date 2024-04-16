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

    public static void transfer(AccountBank sourceAccount, AccountBank destinationAccount, double amount) {
        if (amount > 0) {
            sourceAccount.transfer(destinationAccount, amount);
        } else {
            System.out.println("Số tiền chuyển khoản không hợp lệ.");
        }
    }
}
