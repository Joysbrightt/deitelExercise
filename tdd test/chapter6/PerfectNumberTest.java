package chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {
private PerfectNumber perfectNumber;
    @BeforeEach
   public void setUp() {
        perfectNumber = new PerfectNumber();
    }
    @Test
    public void checkIfNumberIsPerfectNumber(){

        perfectNumber.isPerfect(6);
        assertTrue(perfectNumber.isPerfect(6));

    }
    @Test
    public void checkIfNumberIsAPerfectNumber(){

        perfectNumber.isPerfect(6);
        boolean seeIfits_True = perfectNumber.isPerfect(6);
        assertEquals(true, seeIfits_True);
    }

}