package Cards;

import Bank.BankModule;
import Bank.CardModule;

public class DebitCard extends BankModule implements CardModule {

    public DebitCard(String currency, Double balance, String name) {
        super(currency, balance, name);
    }

    public void replenishment(Double amount) {
        balance += amount;
    }

    public void withdrawal(Double amount) {
        if(balance >= amount)
        {
            balance -= amount;
        } else {
            System.out.println("Not enough money");
        }
    }
    public Double checkBalance() {
        return getBalance();
    }
}
