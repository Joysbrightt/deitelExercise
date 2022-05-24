//package tddClass;
//
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class AccountTest {
//    @Test
//    public void depositTest(){
//
//        Account user1 = new Account();
//        user1.deposit(1500);
//        assertEquals(1500,user1.getBalance());
//    }
//
//    @Test
//    public void negativeDepositTest(){
//
//        Account Tomisin = new Account();
//        Tomisin.deposit(-100);
//        assertEquals(0, Tomisin.getBalance());
//
//    }
//
//@Test
//    public void multipleDepositTest(){
//        Account Tomisin = new Account();
//        Tomisin.deposit ( 100);
//        Tomisin.deposit ( 100);
//        Tomisin.deposit ( 100);
//        Tomisin.deposit ( 500);
//        assertEquals( 800, Tomisin.getBalance());
//
//}
//
//@Test
//    public void withdrawalTest(){
//        Account Tomisin = new Account();
//    Tomisin.deposit ( 100);
//    Tomisin.deposit ( 500);
//        Tomisin.withdrawal(500);
//        assertEquals(100, Tomisin.getBalance());
//}
//
//@Test
//    public void negativeWithdrawalTest(){
//        Account Tomisin = new Account();
//    Tomisin.deposit ( 100);
//    Tomisin.deposit ( 500);
//    Tomisin.withdrawal(700);
//    assertEquals(600, Tomisin.getBalance());
//
//}
//
//@Test
//    public void emptyAccountTest(){
//
//        Account Tomisin = new Account();
//        Tomisin.withdrawal(700);
//        assertEquals(0, Tomisin.getBalance());
//
//}
//}
//
//
//
