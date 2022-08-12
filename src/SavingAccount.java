import java.util.Random;
public class SavingAccount {

    String accountHolderName;
    double accountBalance;
    String accountStatus;
    long accountNumber;

    public double withdraw(double accountBalance,double withdrawMoney) {
        if (accountBalance >= withdrawMoney) {
            double remainingBalance = accountBalance - withdrawMoney;
            return remainingBalance;
        }
    }

    public long autoGenerateAccountNumber(String[] args) {
        Math.random();
        long number=(long) (Math.random()*1000000000000L);
        Random obj = new Random();
        System.out.println(obj.nextLong());
    }

    public double checkAccountBalance(){
        return accountBalance;
    }

    public  double depositCash(double accountBalance,double depositAmount){
        double remainingBalance= accountBalance+ depositAmount;
        return remainingBalance;
    }

    public double transferFund(double accountBalance,double transferAmount){
        double remainingBalance=accountBalance-transferAmount;
        return remainingBalance;
    }


}
