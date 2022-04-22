package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack stack;

            @BeforeEach
            public void setUp(){
                stack = new Stack();

            }


    @Test


    public void stackCanBeCreatedTest(){
        Stack stack = new Stack();
        assertNotNull((stack));

    }

    @Test
    public void Stack_IsEmpty_Test(){
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());

    }
@Test
    public void pushOneElement_StackIsNotEmptyTest(){
    stack.push(13);

    assertFalse(stack.isEmpty());
}

@Test
    public void pushX_popX_stackShouldBeEmptyTest(){
                stack.push(11);
                stack.pop();
                assertTrue(stack.isEmpty());

}

@Test
    public  void pushXandY_popY_stackShouldBeNotBeEmptyTest(){
                stack.push(11);
                stack.push(12);
                stack.pop();
                assertFalse(stack.isEmpty());

}

@Test

    public void pushX_popX_elementsShouldBeXTest(){
                stack.push(34);
                int element = stack.pop();
                assertEquals(34, stack.pop());


}


@Test

    public void pushXand_popYandX_elementIsYthenXTest(){
                stack.push(34);
                stack.push(22);
                int element = stack.pop();
                assertEquals(22,element);
                element = stack.pop();
                assertEquals(34, element);


    }

    @Test

    public  void  pushXand_popYandX_peekReturnsYTest(){
                stack.push(32);
                stack.push(69);
                int element = stack.peek();
                assertEquals(69, element);

                element = stack.pop();
                assertEquals(69,element);

                element = stack.peek();
                assertEquals(32, element);



    }




















}
