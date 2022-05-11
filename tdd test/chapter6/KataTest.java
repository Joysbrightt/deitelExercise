package chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    private Kata kata;

    @BeforeEach
    public void setUp(){
        kata = new Kata();
    }
    @Test
    public void convertCelsiusToKelvinTest(){
        double result = Kata.convertToKelvin(10);
        assertEquals(283.15, result);

    }

    @Test
    public void convertKelvinToCelsuisTest(){

        double temperature = kata.convertToCelsius(400);
        assertEquals(126.85000000000002,temperature);
    }

}
