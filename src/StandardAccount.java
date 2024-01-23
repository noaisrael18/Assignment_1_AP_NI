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
        double allowed_amount = - CreditLimit + Balance;
        if (amount <= allowed_amount) {
            Balance -= amount;
            return amount;
        }
        else {
            Balance -= allowed_amount;
            System.out.println("Requested amount exceeds limit.");
            return allowed_amount;
        }
    }

    public double GetCurrentBalance() {

        return Balance;
    }

    public int GetAccountNumber() {

        return AccountNumber;
    }
}
