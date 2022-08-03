import java.util.Random;


public class TestBankAccount{
    public static void main(String[] args){
        
        BankAccount customer1 = new BankAccount();
        System.out.println(customer1.getaccountNumber());
        
        customer1.deposit("checking", 300.0);
        System.out.println(customer1.getcheckingBalance());
        
        customer1.deposit("saving", 400.0);
        System.out.println(customer1.getsavingBalance());

        // System.out.println(customer1.amountOfMoneyStored);

        // customer1.withdraw("checing", 900.0);

        customer1.displayAccountsBalance();
    }
}