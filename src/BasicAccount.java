public class BasicAccount extends StandardAccount{

    // State
    protected double WithdrawalLimit;

    // Constructor
    public BasicAccount (int accountNumber,double withdrawalLimit) {
        super(accountNumber, 0);
        // Initializing WithdrawalLimit
        this.WithdrawalLimit = withdrawalLimit;
    }

    // Behavior - only those diff. to Standard Account
    public double Withdraw(double amount){
        // Limit the withdrawal to the minimum between requested amount and the set withdrawal limit:
        double withdrawal_amount = Math.min(amount,WithdrawalLimit );
        // Make sure it doesn't exceed the account balance
        withdrawal_amount = Math.min(withdrawal_amount, Balance);

        // Once the withdrawal amount has been "authorized", deduct the withdrawal amount from the balance
        Balance -=  withdrawal_amount;
        // Return the amount that was actually withdrawn
        return  withdrawal_amount;
    }

}
