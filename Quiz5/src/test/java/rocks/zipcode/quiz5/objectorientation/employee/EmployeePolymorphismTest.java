package rocks.zipcode.quiz5.objectorientation.employee;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz5.objectorientation.account.Account;
import rocks.zipcode.quiz5.objectorientation.account.Employee;
import rocks.zipcode.quiz5.objectorientation.account.Transactable;
import rocks.zipcode.quiz5.objectorientation.account.Worker;

/**
 * @author leon on 30/12/2018.
 */
public class EmployeePolymorphismTest {
    private Employee employee = new Employee();

    @Test
    public void test1() {
        Assert.assertTrue(employee instanceof Transactable);
    }

    @Test
    public void test2() {
        Assert.assertTrue(employee instanceof Worker);
    }


    @Test(expected = ClassCastException.class)
    public void test3() {
        Account account = (Account) (Object) employee;
    }
}
