package Cards;

import Bank.BankModule;
import Bank.CardModule;

public class CreditCard extends BankModule implements CardModule {

    private Double percentRate;
    private Double debt;
    public CreditCard(String currency, Double balance, String name, Double percentRate) {
        super(currency, balance, name);
        this.percentRate = percentRate;
        debt = balance;
    }

    public double debtRequest(){
        if(balance < 0) {
            debt = balance;
        }
        return debt;
    }

    public Double getPercentRate(){
        return percentRate;
    }

    public void setPercentRate(Double percentRate) {
        this.percentRate = percentRate;
    }

    public void replenishment(Double amount) {
        balance += amount;
    }

    public void withdrawal(Double amount) {
            balance -= amount;
    }

    public Double checkBalance() {
        return balance;
    }


}
