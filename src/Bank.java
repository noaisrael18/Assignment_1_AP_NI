import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank {

    // State
    List <IAccount> AccList;

    // Constructor
    public Bank() {
       this.AccList = new ArrayList<>();
    }

    // Behavior
    public void OpenAccount(IAccount account){
        AccList.add(account);
    }
    public void CloseAccount(int accountNumber){
        for (IAccount myAccount : AccList) {
            if (myAccount.GetAccountNumber() == accountNumber){
                if (myAccount.GetCurrentBalance() > 0){
                    AccList.remove(myAccount);
                    System.out.println("Your account was successfully closed");
                }
                else{
                    System.out.println("Your account could not be closed due to debt of " + myAccount.GetCurrentBalance() + " ILS");
                }
            }
        }
    }
    public List<IAccount> GetAllAccounts(){
        return AccList;
    }
    public List<IAccount> GetAllAccountsInDebt(){
        List<IAccount> DebtAccList = new ArrayList<>();
        for (IAccount myAccount : AccList) {
            if (myAccount.GetCurrentBalance() < 0) {
                DebtAccList.add(myAccount);
            }
        }
        return DebtAccList;
    }
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove){
        List<IAccount> AboveBalanceAccList = new ArrayList<>();
        for (IAccount myAccount : AccList) {
            if (myAccount.GetCurrentBalance() > balanceAbove) {
                AboveBalanceAccList.add(myAccount);
            }
        }
        return AboveBalanceAccList;
    }
}

