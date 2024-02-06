import javax.swing.event.TableModelListener;

public class BasicAccount implements IAccount {
    private double Balance;
    private double WithdrawalLimit;
    private int AccountNumber;

    public BasicAccount(int accountNumber, double withdrawalLimit) {
        this.Balance = 0;
        this.WithdrawalLimit = withdrawalLimit;
        this.AccountNumber = accountNumber;
    }

    @Override
    public void Deposit(double amount) {
        Balance += amount;

    }

    @Override
    public double Withdraw(double amount) {
        if (amount <= Balance) {
            Balance -= amount;
            return amount;
        } else {
            return 0;
        }
    }

    @Override
    public double GetCurrentBalance() {
        return Balance;
    }

    @Override
    public int GetAccountNumber() {
        return AccountNumber;
    }
}