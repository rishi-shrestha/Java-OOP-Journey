package topic_02_bank_system;

public class SavingAccount extends BankAccount implements Security{
    private double rate;
    private int pin;

    SavingAccount(String name,String acc,double bal, double rate, int pin){
        super(name,acc,bal);
        this.rate=rate;
        this.pin=pin;
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=balance){
            balance-=amount;
            System.out.println("Amount withdrawn successfully");
        }
        else {
            System.out.println("Error");
        }
    }

    @Override
    public boolean verifyPin(int pin) {
        return this.pin==pin;
    }

    public void addInterest(){
        double interest=balance*(rate/100);
        deposit(interest);
        System.out.println("Interest deposited successfully. Interest = "+interest);
    }
}
