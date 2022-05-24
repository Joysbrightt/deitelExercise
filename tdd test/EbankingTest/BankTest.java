package EbankingTest;

import Ebanking.Accounting;
import Ebanking.Banking;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
    private Banking gtBank;
    private Accounting account;

    @BeforeEach
    public void setUp(){
        gtBank = new Banking("gtBank" , 4);
         }

    @Test
    public void bankCanBeCreateTest(){
        assertNotNull(gtBank);
    }

    @Test
    public void bankCanCreateAccountTest(){
        gtBank.createAccountFor("Joseph" , "Joy", "1234");
        gtBank.createAccountFor("Suri" , "Jay", "1234");
        gtBank.createAccountFor("Lanka" , "Lanka", "1234");
        gtBank.createAccountFor("Gorge" , "Joy", "1234");
        assertEquals(4, gtBank.getNumberOfCustomers);

Accounting account = gtBank.findAccount(4);
assertEquals("lanka Lanka", account.getAccountNumber());

    }

@Test public void bankCanDepositMoneyTest(){
        gtBank.deposit(12000, "1");
        gtBank.deposit(3000, "1");

        assertEquals(15000, account.getBalance("1234"));

}


@Test public void bankCanWithdrawMoneyTest(){

        gtBank.createAccountFor("Joseph", "Joy", "1234");
        gtBank.deposit(12000, "1");
        gtBank.withdraw(10000, "1", "1234");
        Accounting account = gtBank.findAccount(1);
        assertEquals(2000, account.getBalance("1234"));
}

@Test public void bankCanTransferMoneyTest() {
            gtBank.createAccountFor("Joseph", "Joy", "1234");
            gtBank.createAccountFor("Lanka", "Lanka", "1221");

            gtBank.deposit(5000, "1");
            Accounting account = gtBank.findAccount(1);
            assertEquals(5000, account.getBalance("1234"));

            gtBank.transfer(2000, "1", "3", "1234");

            account = gtBank.findAccount(1);
            assertEquals(3000, account.getBalance("1234"));

            account = gtBank.findAccount(2);
            assertEquals(2000, account.getBalance("1221"));

}



}