public class Main {

    public static void main(String[] args) {

        // Standard Account Test
        StandardAccount standardAccount = new StandardAccount(1, -100);
        standardAccount.Deposit(100);
        double withdrawnAmount = standardAccount.Withdraw(200);
        if (withdrawnAmount != 100) {
            System.err.println("Standard account withdraw limit test failed!");
        }

        // Basic Account Test
        BasicAccount basicAccount = new BasicAccount(2, 100);
        basicAccount.Deposit(100);
        withdrawnAmount = basicAccount.Withdraw(200);
        if (withdrawnAmount != 100) {
            System.err.println("Basic account withdraw limit test failed!");
        }

        // Premium Account Test
        PremiumAccount premiumAccount = new PremiumAccount(3);
        premiumAccount.Deposit(100);
        withdrawnAmount = premiumAccount.Withdraw(200);
        if (withdrawnAmount != 200) {
            System.err.println("Premium account withdraw limit test failed!");
        }

        // Account Closure Test
        StandardAccount account = new StandardAccount(4, -100);
        Bank bank = new Bank();
        boolean closed = bank.closeAccount(4);  // Adjusted to lowercase "c"
        if (closed) {
            System.err.println("Account closure test failed!");
        }
    }
}
