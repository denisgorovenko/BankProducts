import Cards.CreditCard;
import Cards.CurrencyDebitCard;
import Cards.DebitCard;
import Deposits.Deposit;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestBankProducts {


    @Test
    public void testCreditCard(){
        CreditCard creditCard = new CreditCard("USD",256.6,"test card",0.6);
        creditCard.setPercentRate(1.2);
        assertEquals(1.2 , creditCard.getPercentRate(),0.0);
        creditCard.withdrawal(56.6);
        assertEquals(200.0, creditCard.checkBalance(), 0.3);
        creditCard.replenishment(100.0);
        assertEquals(300.0, creditCard.checkBalance(), 0.3);
        creditCard.replenishment(400.0);
        assertEquals(-100 , creditCard.debtRequest(),0);
    }

    @Test
    public void testDebitCard(){
        DebitCard debitCard = new DebitCard("EUR", 1500.0,"test debit");
        assertEquals(1500.0, debitCard.checkBalance(), 0.0);
        debitCard.withdrawal(500.0);
        assertEquals(1000.0, debitCard.checkBalance(), 0.0);
        debitCard.replenishment(500.0);
        assertEquals(1500.0, debitCard.checkBalance(), 0.0);
    }

    @Test
    public void testCurrencyDebitCard(){
        CurrencyDebitCard currencyDebitCard = new CurrencyDebitCard("RUB" , 50000.0, "test currency debit card");
        assertEquals(50000.0, currencyDebitCard.checkBalance(), 0.0);
        currencyDebitCard.withdrawal(25000.0);
        assertEquals(25000.0, currencyDebitCard.checkBalance(), 0.0);
        currencyDebitCard.replenishment(5000.0);
        assertEquals(30000.0, currencyDebitCard.checkBalance(), 0.0);
    }

    @Test
    public void testDeposit(){
        Deposit deposit = new Deposit("USD" ,10000.0 ,"test deposit");
        assertEquals(10000.0, deposit.checkBalance(), 0.0);
        deposit.replenishment(5000.0);
        assertEquals(15000.0, deposit.checkBalance(), 0.0);
        deposit.close();
    }

}
