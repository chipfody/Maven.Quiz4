package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    List<BankAccount> portfolio = new ArrayList<BankAccount>();

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        portfolio.remove(portfolio.get(indexNumber));

        return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
        portfolio.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        //throw new UnsupportedOperationException("Account does not exist");
        if (portfolio.contains(bankAccount)) {
            return true;
        } else {return false;}
    }
}
