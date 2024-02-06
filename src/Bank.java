
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<IAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void openAccount(IAccount account) {
        accounts.add(account);
    }

    public boolean closeAccount(int accountNumber) {
        for (IAccount account : accounts) {
            if (account.GetAccountNumber() == accountNumber) {
                if (account.GetCurrentBalance() >= 0) {
                    accounts.remove(account);
                    System.out.println("Account closed successfully.");
                } else {
                    System.out.println("Account not closed due to debt.");
                }
                return false;
            }
        }
        // If account not found, ignore the request
        return false;
    }

    public List<IAccount> getAllAccounts() {
        return new ArrayList<>(accounts);
    }

    public List<IAccount> getAllAccountsInDebt() {
        List<IAccount> accountsInDebt = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.GetCurrentBalance() < 0) {
                accountsInDebt.add(account);
            }
        }
        return accountsInDebt;
    }

    public List<IAccount> getAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> accountsWithBalanceAbove = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.GetCurrentBalance() > balanceAbove) {
                accountsWithBalanceAbove.add(account);
            }
        }
        return accountsWithBalanceAbove;
    }
}
