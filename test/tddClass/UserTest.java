package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    User user ;
    @BeforeEach
    void setUp(){
        user =  new User();
    }

    @Test
    void test1(){
//       Given that i have a user
//        Then i can set the name of the user
//        user.setName("name");
//        Let's get the users name
//        assertEquals("name",user.getName());

//        i want 2 copies of the book
         assertEquals(4000,sell(2));
    }
    int sell(int numberOfCopies){
        if (numberOfCopies <=4 && numberOfCopies >=1){
            return numberOfCopies * 2000;
        }
        else return 0;
    }
}