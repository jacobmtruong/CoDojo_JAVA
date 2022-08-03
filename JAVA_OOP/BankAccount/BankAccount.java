import java.util.Random;

public class BankAccount{
    //The class should have the following attributes: (double) checking balance, (double) savings balance.

    private Double checkingBalance = 0.0;
    private Double savingBalance = 0.0;

    //Create a class member (static) that has the number of accounts created thus far.
    private static int numberOfAccounts = 0;
    
    //Create a class member (static) that tracks the total amount of money stored in every account created.

    private static Double amountOfMoneyStored = 0.0;

    // NINJA BONUS: Add the the following class attribute: account number. The type is up to you, can be a String or a Long or another type.

    private String accountNumber = "";

    public String getaccountNumber() {
        return accountNumber;
    }

    public void setaccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    //In the constructor, be sure to increment the account count.

    //NINJA BONUS: In the constructor, call the private method from above so that each user has a random ten digit account.
    
    public BankAccount(){
        String accountNumber = accountNumber();
        Double checkingBalance = 0.0;
        Double savingBalance = 0.0;
        numberOfAccounts += 1;
        Double amountOfMoneyStored = 0.0;
    }

    //Create a getter method for the user's checking account balance.
    //Create a getter method for the user's saving account balance.

    //Getters 

    public double getcheckingBalance(){
        return checkingBalance;
    }

    public double getsavingBalance(){
        return savingBalance;
    }

    // Setters

    public void setcheckingBalance(Double checkingBalance){
        this.checkingBalance = checkingBalance;
    }

    public void setsavingBalance(Double savingBalance){
        this.savingBalance = savingBalance;
    }

    //Methods 

    //Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.

    public void deposit (String account, Double amount) {
        if (account == "checking"){
            setcheckingBalance (getcheckingBalance() + amount);
            amountOfMoneyStored = amountOfMoneyStored + amount;
        }
        if (account == "saving"){
            setsavingBalance (getsavingBalance() + amount);
            amountOfMoneyStored += amount;
        }
        else {
            System.out.println("You don't have a valid account.");
        }
    }   

    //Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.

    public void withdraw (String account, double amount){
        if (account == "checking"){
            if (getcheckingBalance() < amount){
                System.out.println ("Insufficient funds.");
            }
            else {
                setcheckingBalance(getcheckingBalance() - amount);
                amountOfMoneyStored -= amount;
            }
        if (account == "saving"){
            if (getsavingBalance() < amount){
                System.out.println ("Insufficient funds.");
            }
            else {
                setsavingBalance(getsavingBalance() - amount);
                amountOfMoneyStored -= amount;
                }   
            }
        else {
            System.out.println("Can't locate account.");
            }
        }
    }

    //Create a method to see the total money from the checking and saving.

    public void displayAccountsBalance(){
        System.out.printf ("Your checking balance is: %s\n", getcheckingBalance());
        System.out.printf ("Your saving balance is: %s", getsavingBalance());
    }

    //NINJA BONUS: Create a private method that returns a random ten digit account number.

    private String accountNumber(){
        String randomChart = "012345abcd";
        String random = "";

        Random rand = new Random();
        for(int i = 0; i < 10; i ++){
            char num = randomChart.charAt(rand.nextInt(10));
            random += num;
        }
        accountNumber = random;
        return random;
    }
}