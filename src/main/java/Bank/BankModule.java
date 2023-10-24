package Bank;

public abstract class BankModule {

    protected String currency;
    protected Double balance;
    protected String name;

    public BankModule(String currency, Double balance, String name){
        this.currency = currency;
        this.balance = balance;
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }
}
