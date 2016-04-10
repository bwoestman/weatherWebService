package com.weatherWebService;

import org.apache.log4j.Logger;
import org.junit.Test;
import sun.plugin2.util.NativeLibLoader;

import java.io.BufferedReader;

import static org.junit.Assert.assertTrue;

/**
 * Created by Bdub on 3/18/16.
 */
public class TestsForWeatherController
{
    public final static Logger log = Logger.getLogger("weatherWebService");
    private WeatherController weatherController;

    @Test
    public void testResponseOk() throws Exception
    {
        weatherController = new WeatherController();
        BufferedReader response = weatherController.sendGet("41", "-89");
        assertTrue(response != null);
    }

    @Test
    public void testJsonResponse() throws Exception
    {
        String responseJson;
        weatherController = new WeatherController();
        BufferedReader in = weatherController.sendGet("41", "-89");
        responseJson = weatherController.printJSONResponse(in);

        assertTrue(responseJson.getClass() != null);
    }
}