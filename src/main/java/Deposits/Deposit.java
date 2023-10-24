package Deposits;

import Bank.BankModule;
import Bank.DepositModule;

public class Deposit extends BankModule implements DepositModule {

    public Deposit(String currency, Double balance, String name) {
        super(currency, balance, name);
    }

    public void close() {
        balance = 0.0;
        System.out.println("Your deposit is closed");
    }

    public void replenishment(Double amount) {
        balance += amount;
    }

    public Double checkBalance() {
        return balance;
    }
}
