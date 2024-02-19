public class StandardAccount implements IAccount{

    // State
    public int AccountNumber;
    protected double Balance;
    public double CreditLimit;

    // Constructor
    public StandardAccount(int accountNumber, double creditLimit) {
        this.AccountNumber = accountNumber;
        this.Balance = 0;

        // If positive credit limit is inputted by user, convert to 0
        if (creditLimit > 0){
            this.CreditLimit = 0;
        } else {
            this.CreditLimit = creditLimit;
        }
    }

    // Behavior
    public void Deposit(double amount){

        Balance += amount;
    }
    public double Withdraw(double amount){
            double maxWithdrawal = Balance - CreditLimit; // Maximum that can be withdrawn
            double withdrawal_amount = Math.min(amount, maxWithdrawal);
            Balance -= withdrawal_amount;
            return withdrawal_amount;
    }

    public double GetCurrentBalance() {

        return Balance;
    }

    public int GetAccountNumber() {

        return AccountNumber;
    }
}
