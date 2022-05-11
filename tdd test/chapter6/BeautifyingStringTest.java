package chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BeautifyingStringTest {
    private BeautifyingString beautifyingString;

    @BeforeEach
    public void setUp() {
        beautifyingString = new BeautifyingString();
    }

    @Test
    public void canBeCreatedTest() {

        assertNotNull(beautifyingString);
    }

    @Test
    public void terminateStringTest() {
        BeautifyingString.terminateString();
//         assertEquals();
//}@Test
//    public void terminateIfNotCapitalLetterTest(){
//
//         BeautifyingString.capitalizeFirstLetter();
//
//
//    }


    }
}
