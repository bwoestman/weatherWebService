package com.weatherWebService;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 * @author jjjasonm
 *         Created on 4/8/16.
 */
public class DayOfWeatherTest {

    private DayOfWeather dayOfWeather;
    private final String cloudy = "cloudy";

    @Before
    public void setUp() throws Exception {

        dayOfWeather = new DayOfWeather();
        dayOfWeather.setCloudCover(cloudy);

    }

    @Test
    public void testSetCloudCover() throws Exception {

        assertNotNull(dayOfWeather.getCloudCover());

    }

    @Test
    public void testGetCloudCover() throws Exception {
        String test = dayOfWeather.getCloudCover();
        assertEquals(test,cloudy);
    }

    @Test
    public void testToString() throws Exception {

    }
}