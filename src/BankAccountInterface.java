public interface BankAccountInterface {

    String fetchBalance(String password);
    double addMoney(double amount);
    String withdrawMoney(String password,double money);
    String changePassword(String newPassword, String oldPassword);
    double calculateInterest(int years);
}
