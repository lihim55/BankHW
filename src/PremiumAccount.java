public class PremiumAccount implements IAccount  {
    private double Balance;
    private int AccountNumber;

    public PremiumAccount(int accountNumber) {
        this.Balance = 0;
        this.AccountNumber = accountNumber;
    }

    @Override
    public void Deposit(double amount) {
        if (amount > 0 ) {
            this.Balance += amount;
        } else {
        }

    }

    @Override
    public double Withdraw(double amount) {
        if (amount > 0 ) {
            this.Balance -= amount;
            return amount;
        } else {
            return 0;
        }
    }

    @Override
    public double GetCurrentBalance() {
        return this.Balance;
    }

    @Override
    public int GetAccountNumber() {
        return this.AccountNumber;
    }
}
