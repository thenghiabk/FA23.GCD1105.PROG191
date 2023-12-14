package L09_Testing.BankSystem;

public class BankTransactionSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", 1000);

        try {
            account.deposit(500);
            account.withdraw(200);

            /* Uncomment each of the following statement to check the exception */
            // account.withdraw(2000); // This will throw InsufficientFundsException
            // account.deposit(-100); // This will throw NegativeAmountException

        } catch (InsufficientFundsException | NegativeAmountException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Final account balance: " + account.getBalance());
        }

    }
}
