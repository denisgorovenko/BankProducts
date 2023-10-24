package Bank;

public interface CardModule {

    void replenishment(Double amount);
    void withdrawal(Double amount);
    Double checkBalance();

}
