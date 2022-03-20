package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    public void AccountNameTest() {
        Account account = new Account();
        account.setName("Tomisin Johnson");
        assertEquals("Tomisin Johnson", account.getName());

    }

    @Test
    public void AccountingTest() {
        Account myAccount = new Account();
        assertEquals(1, myAccount.getAccountNumber());

    }
}