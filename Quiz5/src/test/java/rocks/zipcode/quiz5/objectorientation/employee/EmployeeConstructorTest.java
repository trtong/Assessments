package rocks.zipcode.quiz5.objectorientation.employee;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz5.objectorientation.account.BankAccount;
import rocks.zipcode.quiz5.objectorientation.account.Employee;
import rocks.zipcode.quiz5.objectorientation.account.Transactable;
import rocks.zipcode.quiz5.objectorientation.account.Worker;

/**
 * @author leon on 30/12/2018.
 */
public class EmployeeConstructorTest {
    @Test
    public void testNullaryConstructor() {
        // given
        Employee employee = new Employee();
        Worker workerEmployee = (Worker) employee;
        Transactable transactableEmployee = (Transactable) employee;
        Transactable bankAccount = (Transactable) employee.getBankAccount();



        Double expectedHourlyWage = 35.0;
        Double expectedHoursWorked = 0.0;
        Double expectedBalance = 0.0;
        Double expectedBankAccountBalance = 0.0;

        Assert.assertNotNull(employee.getBankAccount());
        Assert.assertEquals(expectedHourlyWage, workerEmployee.getHourlyWage());
        Assert.assertEquals(expectedHoursWorked, workerEmployee.getHoursWorked());
        Assert.assertEquals(expectedBalance, transactableEmployee.getBalance());
        Assert.assertEquals(expectedBankAccountBalance, bankAccount.getBalance());
    }

    @Test
    public void testNonNullaryConstructor() {
        // given
        Double expectedHourlyWage = 35.0;
        Double expectedHoursWorked = 0.0;
        Double expectedBalance = 15.0;
        Double expectedBankAccountBalance = expectedBalance;
        Double expectedMoneyEarned = expectedHourlyWage * expectedHoursWorked;
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(expectedBankAccountBalance);
        Transactable transactableBankAccount = (Transactable)bankAccount;

        // when
        Employee employee = new Employee(bankAccount);
        Worker workerEmployee = (Worker) employee;
        Transactable transactableEmployee = (Transactable) employee;


        Assert.assertNotNull(employee.getBankAccount());
        Assert.assertEquals(expectedHourlyWage, workerEmployee.getHourlyWage());
        Assert.assertEquals(expectedHoursWorked, workerEmployee.getHoursWorked());
        Assert.assertEquals(expectedBalance, transactableEmployee.getBalance());
        Assert.assertEquals(expectedMoneyEarned, expectedMoneyEarned);
        Assert.assertEquals(expectedBankAccountBalance, transactableBankAccount.getBalance());
    }

}
