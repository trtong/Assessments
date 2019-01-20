package rocks.zipcode.quiz5.collections;

import rocks.zipcode.quiz5.objectorientation.account.BankAccount;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    List<BankAccount> accounts = new ArrayList<>();

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        accounts.remove(accounts.get(indexNumber));
        return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
        accounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return accounts.contains(bankAccount);
    }
}
