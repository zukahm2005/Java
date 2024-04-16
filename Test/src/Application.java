import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountBank account = new AccountBank();

        // Nhập thông tin tài khoản
        // Nhập số tài khoản
        System.out.println("Nhập số tài khoản:");
        String accountNumber = scanner.nextLine();
        account.setAccountNumber(accountNumber);

// Xóa bộ nhớ đệm để tiêu diệt kí tự dòng mới
//        scanner.nextLine();

// Nhập tên chủ tài khoản
        System.out.println("Nhập tên chủ tài khoản:");
        String accountHolderName = scanner.nextLine();
        account.setAccountHolderName(accountHolderName);

        // Thực hiện các giao dịch
        System.out.println("Thực hiện các giao dịch:");
        System.out.println("1. Gửi tiền");
        System.out.println("2. Rút tiền");
        System.out.println("3. Chuyển khoản");
        System.out.println("0. Thoát");

        int choice;
        do {
            System.out.println("Nhập lựa chọn của bạn:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập số tiền gửi:");
                    double depositAmount = scanner.nextDouble();
                    TransactionManager.deposit(account, depositAmount);
                    account.displayAccountInfo();
                    break;
                case 2:
                    System.out.println("Nhập số tiền rút:");
                    double withdrawAmount = scanner.nextDouble();
                    TransactionManager.withdraw(account, withdrawAmount);
                    account.displayAccountInfo();
                    break;
                case 3:
                    System.out.println("Nhập số tiền chuyển:");
                    double transferAmount = scanner.nextDouble();
                    TransactionManager.transfer(account, scanner, transferAmount);
                    account.displayAccountInfo();
                    break;
                case 0:
                    System.out.println("Đang thoát chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (choice != 0);

        scanner.close();
    }
}