public class PremiumAccount extends StandardAccount{

    // Constructor
    public PremiumAccount(int accountNumber) {
        super(accountNumber,0);
    }

    // Behavior - only those diff. to Standard Account
    public double Withdraw(double amount){
        Balance -= amount;
        return amount;
    }
}

