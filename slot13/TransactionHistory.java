package Lab4.slot13;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class TransactionHistory {
    private Long id;

    private LocalDate dayTrading;



    private String description;


    private String beneficiaryAccount;


    private long money;

    public TransactionHistory(String description, String beneficiaryAccount, long money) {
        this.id = IdGenerate.getNewID();
        this.dayTrading = LocalDate.now();
        this.description = description;
        this.beneficiaryAccount = beneficiaryAccount;
        this.money = money;
    }

    public void setBeneficiaryAccount(String beneficiaryAccount) {
        this.beneficiaryAccount = beneficiaryAccount;
    }

    public String getBeneficiaryAccount() {
        return beneficiaryAccount;
    }

    public Long getId(){return id;}


    public void setDayTrading(LocalDate dayTrading) {
        this.dayTrading = dayTrading;
    }

    public LocalDate getDayTrading() {
        return dayTrading;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public long getMoney() {
        return money;
    }

    public String toString(){
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return id + " - " + dayTrading.format(myFormatter) + " - " + description + " - "
                + Controller.formatMoney(money) + " - " + beneficiaryAccount + "\n";
    }

}
