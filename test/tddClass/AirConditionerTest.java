package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void airConditionerDefaultStatusIsOffTest(){
        AirConditioner airCon = new AirConditioner();
        assertFalse(airCon.isOn());

    }
    @Test
    public void airConditionerCanBeTurnedOnTest(){
        AirConditioner airCon = new AirConditioner();
        assertFalse(airCon.isOn());
        airCon.turnOn();
        assertTrue(airCon.isOn());
    }
    @Test
    public void airConditionerCanBeTurnedOffTest(){
        AirConditioner airCon = new AirConditioner();
        assertFalse(airCon.isOn());
        airCon.turnOn();
        assertTrue(airCon.isOn());
        airCon.turnOff();
        assertFalse(airCon.isOn());
    }
    @Test
    public void whenAirConditionerIsOn_defaultTemperatureIs16(){
        AirConditioner airCon = new AirConditioner();
        airCon.turnOn();
        assertTrue(airCon.isOn());
        airCon.getTemperature();
        assertEquals(16, airCon.getTemperature());
    }
    @Test
    public void airConditionerTemperatureCanBeIncreasedTest(){
        AirConditioner airCon = new AirConditioner();
        airCon.turnOn();
        assertTrue(airCon.isOn());
        assertEquals(16, airCon.getTemperature());
        airCon.increaseTemperature();
        assertEquals(17, airCon.getTemperature());
    }
    @Test
    public void airConditionerTemperatureCanBeIncreasedMoreThanOneTest(){
        AirConditioner airCon = new AirConditioner();
        airCon.turnOn();
        assertTrue(airCon.isOn());
        assertEquals(16, airCon.getTemperature());
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        assertEquals(22, airCon.getTemperature());
    }

    @Test
    public void airConditionerTemperatureDoesNotIncreaseWhenOffTest(){
        AirConditioner airCon = new AirConditioner();
        airCon.turnOn();
        assertTrue(airCon.isOn());
        assertEquals(16, airCon.getTemperature());
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        assertEquals(19, airCon.getTemperature());
        airCon.turnOff();
        assertEquals(0,airCon.getTemperature());
        assertFalse(airCon.isOn());
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        assertEquals(0, airCon.getTemperature());
    }
    @Test
    public void airConditionerTemperatureDoesNotExceed_30(){
        AirConditioner airCon = new AirConditioner();
        airCon.turnOn();
        assertTrue(airCon.isOn());
        assertEquals(16, airCon.getTemperature());
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        assertEquals(30, airCon.getTemperature());
        airCon.increaseTemperature();
        airCon.increaseTemperature();
      assertEquals(30, airCon.getTemperature());


    }
    @Test
    public void airConditionerIncreaseTemperature() {
        AirConditioner airCon = new AirConditioner();
        airCon.turnOn();
        assertTrue(airCon.isOn());
        assertEquals(16, airCon.getTemperature());
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        airCon.increaseTemperature();
        assertEquals(24, airCon.getTemperature());
        airCon.decreaseTemperature();
        airCon.decreaseTemperature();
        airCon.decreaseTemperature();
        airCon.decreaseTemperature();
        airCon.decreaseTemperature();
        airCon.decreaseTemperature();
        airCon.decreaseTemperature();
        assertEquals(17, airCon.getTemperature());

    }
}
