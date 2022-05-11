package Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DigitalNumberTest {

    DigitalNumber digitalNumber = new DigitalNumber();
    @BeforeEach
    public void setUp(){
        digitalNumber = new DigitalNumber();
    }
    @Test
    public void userInputCanBeCollectedTest(){
        digitalNumber.collectUserInput();

        assertEquals("10110101", digitalNumber.collectUserInput());
    }

    @Test
    public void displaySwitchCanBeOn_OffTest(){
        digitalNumber.isOn(1);

        assertEquals(true, digitalNumber.isOn(1));

    }


    @Test
    public void displayingSegmentTest(){

        digitalNumber.displaySegmentControl();

        assertEquals('#',digitalNumber.displaySegmentControl());
    }

@Test
    public void checkInputLengthTest(){
        boolean numberCheck = digitalNumber.isValidInputLength("10");

    assertEquals("10", numberCheck);

}

@Test
    public void checkIfInputIsValidBinaryNumberTest(){


        boolean checkNum = digitalNumber.isValidBinaryInput("2");
    String inputNumber = " 0";
//    checkNum(Integer.parseInt(String.valueOf(inputNumber.charAt(''))));

    assertEquals(true, checkNum);
}








}
