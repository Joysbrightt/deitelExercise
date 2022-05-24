package Assignment;
import Assignment.DiaryProject.NumberOfBooks;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberofBooksTest {

        NumberOfBooks user ;
        @BeforeEach
        void setUp(){
            user =  new NumberOfBooks();
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
