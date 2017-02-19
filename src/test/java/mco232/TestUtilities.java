package mco232;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestUtilities {
    
    @Test
    public void test1(){
        boolean actual = Utilities.testCode();
        assertTrue(actual);       
    }
    
    @Test
    public void testFahrenheitToCelsius(){
        double actual = Utilities.fahrenheitToCelsius(50);
        assertEquals(10, actual, 0.1); //// Use final for TOLERANCE and use lower value like .000001
    }
    
    @Test
    public void testCelsiusToFahrenheit(){
        double actual = Utilities.celsiusToFahrenheit(10);
        assertEquals(50, actual, 0.1);
    }
    
        @Test
    public void testKelvinToCelsius() {
        double actual = Utilities.kelvinToCelsius(50);
        assertEquals(-223.15, actual, 0.1);
    }

    @Test
    public void testCelsiusToKelvin() {
        double actual = Utilities.celsiusToKelvin(-223.15);
        assertEquals(50, actual, 0.1);
    }

    @Test
    public void testFahrenheitToKelvin() {
        double actual = Utilities.fahrenheitToKelvin(50);
        assertEquals(283.15, actual, 0.1);
    }

    @Test
    public void testKelvinToFahrenheit() {
        double actual = Utilities.kelvinToFahrenheit(283.15);
        assertEquals(50, actual, 0.1);
    }
    
    @Test
    public void testTemperatureConverter() {
        double actual = Utilities.temperatureConverter(Utilities.temperatureUnit.KELVIN_TO_FAHRENHEIT, 283.15);
        assertEquals(50, actual, 0.1);
    }
    
}