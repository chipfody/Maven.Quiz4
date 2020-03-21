package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {

    private Long id;
    private Double balance;


    public void setBalance(Double val) {
        this.balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if (amountToIncreaseBy >= 0) {
            balance = balance + amountToIncreaseBy;
        }else throw new IllegalArgumentException();
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if (amountToDecreaseBy <= balance && amountToDecreaseBy > 0) {
            balance = balance - amountToDecreaseBy;
        } else throw new IllegalArgumentException();
    }

    @Override
    public Double getBalance() {
        return balance;
    }
}
