package L09_Testing.BankSystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
    private BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("1234567890", 1000.0);
    }

    @Test
    public void testDeposit_positiveAmount() throws NegativeAmountException {
        bankAccount.deposit(500.0);
        Assertions.assertEquals(1500.0, bankAccount.getBalance());
    }

    @Test
    public void testDeposit_negativeAmount() {
        Assertions.assertThrows(NegativeAmountException.class, () -> {
            bankAccount.deposit(-500.0);
        });
    }

    @Test
    public void testWithdraw_sufficientFunds() throws InsufficientFundsException, NegativeAmountException {
        bankAccount.withdraw(500.0);
        Assertions.assertEquals(500.0, bankAccount.getBalance());
    }

    @Test
    public void testWithdraw_insufficientFunds() {
        Assertions.assertThrows(InsufficientFundsException.class, () -> {
            bankAccount.withdraw(1500.0);
        });
    }

    @Test
    public void testWithdraw_negativeAmount() {
        Assertions.assertThrows(NegativeAmountException.class, () -> {
            bankAccount.withdraw(-500.0);
        });
    }
}