import java.util.UUID;

public class HdfcBankAccount implements BankAccountInterface {

    private String name;
    private String accountNo;
    private double balance;
    private String password;

    final double rateOfInterest=6.1;

    public HdfcBankAccount() {

    }

    public HdfcBankAccount(String name,  double balance, String password) {
        this.name = name;
        this.accountNo = String.valueOf(UUID.randomUUID());
        this.balance = balance;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "Your current balance is "+this.balance;
        }
        return "Incorrect password";
    }

    @Override
    public double addMoney(double amount) {
        this.balance+=amount;
        return balance;
    }

    @Override
    public String withdrawMoney(String password, double money) {
        if(this.password.equals(password)){
            if(money<=this.balance){
                this.balance-=money;
                return ("Money is Successfully withdrawn and amount left is "+this.balance);

            }else{
               return ("Insufficent Balance");

            }
        }
        return "Wrong Password";
    }

    @Override
    public String changePassword(String newPassword, String oldPassword) {
        if(oldPassword.equals(this.password)){
            this.password=newPassword;
            return "Password updated Successfully";
        }
        return "Password updation failed";
    }

    @Override
    public double calculateInterest(int years) {

        double amount=0.0;
        amount=(this.balance*this.rateOfInterest*years)/100.00;
        return this.balance+amount;
    }
}
