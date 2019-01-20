package rocks.zipcode.quiz5.objectorientation.bankaccount;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz5.objectorientation.account.Account;
import rocks.zipcode.quiz5.objectorientation.account.BankAccount;
import rocks.zipcode.quiz5.objectorientation.account.Transactable;

/**
 * @author leon on 30/12/2018.
 */
public class BankAccountPolymorphismTest {
    BankAccount bankAccount = new BankAccount();

    @Test
    public void test1() {
        Assert.assertTrue(bankAccount instanceof Transactable);
    }

    @Test
    public void test2() {
        Assert.assertTrue(bankAccount instanceof Account);
    }
}
