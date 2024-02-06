public class StandardAccount implements IAccount {
    private double Balance;
    private double CreditLimit;
    private int AccountNumber;

    public StandardAccount(int accountNumber, double creditLimit) {
        this.Balance = 0;
        this.CreditLimit = creditLimit;
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
        double availableBalance = this.Balance + this.CreditLimit;
        if (amount > 0 && amount <= availableBalance) {
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