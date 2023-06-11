public class Main {
public static void main(String args[]){
    HdfcBankAccount acc=new HdfcBankAccount("Ram",1000,"abc123");
    System.out.println("Congrats! "+acc.getName()+"Your account is opened with"+acc.getBalance()+"Balance and your current password is"+acc.getPassword()+"and your account number is "+acc.getAccountNo());
}
    }

