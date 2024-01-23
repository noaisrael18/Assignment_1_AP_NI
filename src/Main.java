import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Initiating a new Standard Account
        StandardAccount myAccount = new StandardAccount(35578, -50);
        System.out.println("My Standard Account number is " + myAccount.AccountNumber + "\nThe credit limit is " + myAccount.CreditLimit);
        // Depositing an amount
        myAccount.Deposit(100);
        System.out.println("My Standard Account balance is " + myAccount.GetCurrentBalance() + " ILS");
        // Withdrawing an amount
        double w = myAccount.Withdraw(250);
        System.out.println("You have withdrawn " + w + " ILS");
        // Checking new balance
        System.out.println("My new Standard Account balance is " + myAccount.GetCurrentBalance() + " ILS");

        // Initiating new Basic Account
        BasicAccount myAccount2 = new BasicAccount(45091, 100);
        myAccount2.Deposit(500);
        System.out.println("My Basic Account balance is " + myAccount2.GetCurrentBalance() + " ILS");
        // Withdrawing an amount
        double w2 = myAccount2.Withdraw(500);
        System.out.println("You have withdrawn " + w2 + " ILS");
        // Checking new balance
        System.out.println("My new Basic Account balance is " + myAccount2.GetCurrentBalance() + " ILS");

        // Initiating new Premium Account
        PremiumAccount myAccount3 = new PremiumAccount(91792);
        myAccount3.Deposit(500);
        System.out.println("My Premium Account balance is " + myAccount3.GetCurrentBalance() + " ILS");
        // Withdrawing an amount
        double w3 = myAccount3.Withdraw(900);
        System.out.println("You have withdrawn " + w2 + " ILS");
        // Checking new balance
        System.out.println("My new Premium Account balance is " + myAccount3.GetCurrentBalance() + " ILS");
        // Retrieving account number
        System.out.println("My Premium Account number is " + myAccount3.GetAccountNumber());

        // Creating a Bank
        Bank myBank = new Bank();
        // Adding accounts to bank accounts list
        myBank.OpenAccount(myAccount);
        myBank.OpenAccount(myAccount2);
        myBank.OpenAccount(myAccount3);
        myBank.CloseAccount(myAccount2.GetAccountNumber());

        System.out.println("These are all the accounts: " + myBank.GetAllAccounts());
        System.out.println("These are all the accounts in debt: " + myBank.GetAllAccountsInDebt());
        System.out.println("These are all the accounts with a balance above requested amount: " + myBank.GetAllAccountsWithBalance(200));
    }
}