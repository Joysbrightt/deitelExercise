package ChapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarClassTest {

    private  CarClass carClass;
    @BeforeEach
    public void setUp(){
        carClass = new CarClass();
    }

    @Test
    public void carClassCanBeCreatedTest(){
        assertNotNull(carClass);

    }
    @Test
    public void modelCanBeSetTest(){

        carClass.setModel("benz");
        String getModel = setModel();
        assertEquals("benz", carClass.getModel());
    }

    private String setModel() {

        return "benz";
    }

    @Test
    public void modelPriceCanBeCreated(){

        carClass.setPrice(2948.23);
        assertEquals(2948.23, carClass.getPrice());

    }


}
