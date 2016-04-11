package com.weatherWebService;

import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by scheffs on 4/11/2016.
 */
public class WeatherTest {
    public final static Logger log = Logger.getLogger("weatherWebService");
    private Weather weather;

    @Test
    public void TestResponseOK() throws Exception {
        weather = new Weather();
        String response = weather.getClichedMessage("lat", "Ion");
        assertTrue(response != null);

    }

}