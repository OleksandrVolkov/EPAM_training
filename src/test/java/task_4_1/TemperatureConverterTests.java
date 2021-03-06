package task_4_1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import task_4.TemperatureConverter;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class TemperatureConverterTests {

    public static TemperatureConverter tc;

    @Parameterized.Parameter
    public double temperatureC;

    @Parameterized.Parameter(1)
    public double temperatureK;

    @Parameterized.Parameter(2)
    public double temperatureF;


    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {0.0, 273.2, 32.0},
                {-100.0, 173.2, -148.0},
                {-273.2, 0.0, -459.76},
                {273.2, 546.4, 523.76}
        });
    }



    @BeforeClass
    public static void init(){
        tc = new TemperatureConverter();
    }


    @Test
    public void testConvertKtoC(){
        double result = tc.convertKtoC(temperatureK);
        assertEquals(temperatureC, result, 0.1);
    }

    @Test
    public void testConvertCtoK() {
        double result = tc.convertCtoK(temperatureC);
        assertEquals(temperatureK, result, 0.1);
    }

    @Test
    public void testConvertFtoC(){
        double result = tc.convertFtoC(temperatureF);
        assertEquals(temperatureC, result, 0.1);
    }

    @Test
    public void testConvertCtoF(){
        double result = tc.convertCtoF(temperatureC);
        assertEquals(temperatureF, result, 0.1);
    }

    @Test
    public void testConvertFtoK(){
        double result = tc.convertFtoK(temperatureF);
        assertEquals(temperatureK, result, 0.1);
    }

    @Test
    public void testConvertKtoF(){
        double result = tc.convertKtoF(temperatureK);
        assertEquals(temperatureF, result, 0.1);
    }

}
