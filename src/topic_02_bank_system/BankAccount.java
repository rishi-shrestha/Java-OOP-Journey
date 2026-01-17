package topic_02_bank_system;

public abstract class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    protected double balance;

    BankAccount(String accountHolderName, String  accountNumber, double balance){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Amount deopoited successfully");
        }
        else{
            System.out.println("Error in depositing the amount");
        }
    }

    public abstract void withdraw(double amount);

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
}
