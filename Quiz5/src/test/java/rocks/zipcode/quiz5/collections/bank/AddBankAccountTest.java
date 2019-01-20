package rocks.zipcode.quiz5.collections.bank;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz5.collections.Bank;
import rocks.zipcode.quiz5.objectorientation.account.BankAccount;

public class AddBankAccountTest {
    @Test
    public void test1() {
        // given
        Bank bank = new Bank();
        BankAccount bankAccount = new BankAccount();
        Assert.assertFalse(bank.containsBankAccount(bankAccount));

        // when
        bank.addBankAccount(bankAccount);

        // then
        Assert.assertTrue(bank.containsBankAccount(bankAccount));
    }
}
