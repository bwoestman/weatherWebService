package com.weatherWebService;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Bdub on 3/18/16.
 */
public class WeatherController
{
    private final String USER_AGENT = "Mozilla/5.0";
    private final static Logger log = Logger.getLogger("com.weatherWebService.WeatherController"); //this.class
    private String responseJson = "";

    public String getResponseJson()
    {
        return responseJson;
    }

    public void setResponseJson(String responseJson)
    {
        this.responseJson = responseJson;
    }

    public BufferedReader sendGet() throws Exception
    {

//        String url = "https://api.forecast.io/forecast/384e291c8f22981980d220fd0400870a/43," +
//            "89";

        String url = "https://api.forecast.io/forecast/384e291c8f22981980d220fd0400870a/43," +
                "89";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        log.info("\nSending 'GET' request to URL : " + url);
        log.info("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));

        String message = con.getResponseMessage();
        log.info(message);

        return in;
    }

    public String printJSONResponse(BufferedReader in) throws IOException
    {

        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null)
        {
            response.append(inputLine);
        }
        in.close();

        responseJson = response.toString();
        //print result
        log.info(response.toString());
        log.info("**********************************************************");

        return response.toString();
    }
}
