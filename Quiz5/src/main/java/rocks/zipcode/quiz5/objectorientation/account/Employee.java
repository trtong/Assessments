package rocks.zipcode.quiz5.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Transactable, Worker{
    private BankAccount bankAccount;
    private Double numOfHoursWorked = 0.0;
    private Double hourlyWage  = 35.0;

    public Employee() {
        bankAccount = new BankAccount();
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        bankAccount.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        bankAccount.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        numOfHoursWorked += numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return numOfHoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return hourlyWage * numOfHoursWorked;
    }
}
