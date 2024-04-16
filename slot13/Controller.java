package Lab4.slot13;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Controller {
    private static long balanceNumber = 1000000;
    List<TransactionHistory> listHistory = new ArrayList<TransactionHistory>();;

    public static long getBalanceNumber() {
        return balanceNumber;
    }

    public static long transfer(long money){
        return balanceNumber;
    }
    public void actionTransfer(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tài khoản thụ hưởng: ");
        String account = scanner.nextLine();
        System.out.print("Nhập số tiền muốn chuyển: ");
        long amount = scanner.nextLong();
        if (amount <= balanceNumber && amount > 0) {
            balanceNumber -= amount;
            System.out.println("Chuyển tiền thành công!");
            System.out.println("Số dư hiện tại: " + Controller.formatMoney(balanceNumber));
        } else {
            System.out.println("Số dư không đủ hoặc số tiền không hợp lệ!");
        }
        scanner.nextLine(); // Clear buffer
        scanner.close();

    }
    public void getHistory(){
        System.out.println("Chức năng xem lịch sử giao dịch chưa được cài đặt.");

    }
    public static String formatMoney(long money) {
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        return formatter.format(money);
    }
}
