package com.weatherWebService;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * @author jjjasonm
 *         Created on 4/8/16.
 */
public class DayOfWeatherTest {

    private final static Logger log = Logger.getLogger("DayOfWeatherTest");

    private DayOfWeather dayOfWeather;
    private final String cloudy = "cloudy";

    @Before
    public void setUp() throws Exception {

        dayOfWeather = new DayOfWeather();
        dayOfWeather.setWindSpeed("strong");
        dayOfWeather.setCloudCover(cloudy);
    }


    @Test
    public void testSetCloudCover() throws Exception {

        assertNotNull("SetCloudCover Tested",dayOfWeather.getCloudCover());
    }

    @Test
    public void testGetCloudCover() throws Exception {

        String test = dayOfWeather.getCloudCover();
        assertEquals(test,cloudy);
    }

    @Test
    public void toStringTest1(){

        String toString = dayOfWeather.toString();
        assertTrue(toString.contains("Cloudiness: " + dayOfWeather.getCloudCover()));
    }

    @Test
    public void toStringTest2() {

        String toString = dayOfWeather.toString();
        assertFalse("I work",toString.matches("Cloudiness:[a-zA-Z]*?"));
    }

    @After
    public void testComplete() {

        log.info("DayOfWeather Test complete.");
    }

}