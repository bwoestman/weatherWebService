package com.weatherWebService;

import org.apache.log4j.Logger;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created by scheffs on 4/11/2016.
 */
public class WeatherTest {

    public final static Logger log = Logger.getLogger("WeatherTest");
    private Weather weather;

    @Test
    public void testGetClichedMessage() throws Exception {
        weather = new Weather();
        String in = weather.getClichedMessage("41", "-89");
        assertTrue(in != null);
    }
}