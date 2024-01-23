public class BasicAccount extends StandardAccount{

    // State
    double WithdrawalLimit;

    // Constructor
    public BasicAccount (int accountNumber,double withdrawalLimit) {
        super(accountNumber, 0);
        // Initializing WithdrawalLimit
        this.WithdrawalLimit = withdrawalLimit;
    }

    // Behavior - only those diff. to Standard Account
    public double Withdraw(double amount){
        // If there's not enough balance to withdraw requested amount, just withdraw whole balance :
        double allowed_amount = Balance;
        if (Balance - amount < CreditLimit){
            Balance -= allowed_amount;
            return allowed_amount;

        // If withdrawal amount is smaller than limit, withdraw requested amount:
        } else if (amount < WithdrawalLimit) {
            Balance -= amount;
            return amount;
        }
        else {
            Balance -= WithdrawalLimit;
            System.out.println("Requested amount exceeds limit.");
            return WithdrawalLimit;
        }
    }


}
