import java.text.DecimalFormat;

public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(83732, 5.50, "Default name",
                "Default mail", "0809999");
    }

    public BankAccount(int number, double balance, String name, String email, String phone) {
        accountNumber = number;
        accountBalance = balance;
        customerName = name;
        this.email = email;
        this.phoneNumber = phone;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999, 100.55, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double credit) {
        double newBalance = accountBalance + credit;

        DecimalFormat df = new DecimalFormat("####,###,###.00");

        setAccountBalance(newBalance);
        System.out.println(" You deposited: " + df.format(credit)
                + "\n New account balance is " + df.format(newBalance));
    }

    public void withdraw(double debit) {
        double newBalance = accountBalance - debit;
        if(newBalance < 0) {
            System.out.println("Insufficient funds!!!");
            return;
        }

        DecimalFormat df = new DecimalFormat("####,###,###.00");

        accountBalance -= debit;
        System.out.println(" You withdrew: " + df.format(debit) +
                "\n New account balance is " + df.format(accountBalance));

    }

}
