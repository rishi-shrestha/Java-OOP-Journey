package topic_02_bank_system;

import java.util.ArrayList;
import java.util.List;

public class BankApp {
    public static void main(String[] args) {
        List<BankAccount> accounts=new ArrayList<>();

        SavingAccount savingAccount=new SavingAccount("Rishi","DOW3425",4000,7,1234);
        accounts.add(savingAccount);

        System.out.println("--- Processing bank accounts ---");
        for(BankAccount acc : accounts){
            System.out.println(acc.getAccountHolderName());
            System.out.println(acc.getBalance());

            acc.withdraw(200);
        }

        System.out.println("\n Special operations");
        if(savingAccount.verifyPin(1234))
        {
            savingAccount.addInterest();
        }
    }
}
