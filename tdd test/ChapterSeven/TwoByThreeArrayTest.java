package ChapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TwoByThreeArrayTest {
    TwoByThreeArray twoByThreeArray;
    @BeforeEach
    public void setUp() {
        twoByThreeArray = new TwoByThreeArray();
    }
    @Test
    public void arrayCanBeCreatedTest(){

        assertNotNull(twoByThreeArray);
    }

//    @Test
//    public void howtoDeclareArrayTTest(){
//
//       int[][] array = twoByThreeArray.declareArrayT([2][3] number);
//        assertEquals((int[][]), array[2][3]);
//    }


}
