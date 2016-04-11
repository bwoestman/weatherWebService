package com.weatherWebService;

import org.apache.log4j.Logger;
import org.junit.Test;

import javax.ws.rs.QueryParam;
import java.io.BufferedReader;

import static org.junit.Assert.*;

/**
 * Created by scheffs on 4/11/2016.
 */
public class WeatherTest {
    public final static Logger log = Logger.getLogger("weatherWebService");
    private Weather weather;

    @Test
    public void TestResponseOK() throws Exception {
        weather = new Weather();
        BufferedReader response = weather.getClichedMessage("lat", "Ion");
        assertTrue(response != null);

    }

}