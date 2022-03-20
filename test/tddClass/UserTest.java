package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tddClass.utmeTest.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    User user ;
    @BeforeEach
    void setUp(){
        user =  new User();
    }

    @Test
    void testSetterAndGetter(){
        user.setNumberOfBooks(2);
        assertEquals(2,user.getNumberOfBooks());
    }

    @Test
    void testThatBookPriceCanBeReturned(){
        user.setNumberOfBooks(2);
        assertEquals(4000.0,user.totalPrice(user.getNumberOfBooks()));
        assertEquals(4000.0,user.totalPrice(2));
    }

    @Test
    void testFiveBooks(){
        user.setNumberOfBooks(5);
        assertEquals(9000.0,user.totalPrice(user.getNumberOfBooks()));
        assertEquals(9000.0,user.totalPrice(5));
    }

    @Test
    void testTenBooksTest(){
        user.setNumberOfBooks(10);
        assertEquals(16000, user.totalPrice(user.getNumberOfBooks()));
        assertEquals(16000, user.totalPrice(10));

    }
}