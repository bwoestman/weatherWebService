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

/**
 * this class is used to send a get request to the DarkSky API and to return a string
 * json
 */
public class WeatherController
{
    private final String USER_AGENT = "Mozilla/5.0";
    private final static Logger log = Logger.getLogger("com.weatherWebService.WeatherController"); //this.class
    private String responseJson = "";
    private Property property = new Property();
    private String message = "";

    /**
     * Gets response json.
     *
     * @return the response json
     */
    public String getResponseJson()
    {
        return responseJson;
    }


    /**
     * Sets response json.
     *
     * @param responseJson the response json
     */
    public void setResponseJson(String responseJson)
    {
        this.responseJson = responseJson;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * This method sends a get request to DarkSky with appended latitude and longitude
     * variables from the incoming GET request.
     *
     * @param lat the lat
     * @param lon the lon
     * @return the buffered reader
     * @throws Exception the exception
     */

    public BufferedReader sendGet(String lat, String lon) throws Exception
    {
        // todo: maybe test this ?
        String url = property.getUrl();
        String key = property.getKey();
        String forecastType = property.getForecastType();
        //String urlWithQuery = url + "/" + forecastType + "/" + key + "/" + lat + "," + lon;
        String urlWithQuery = url + lat + "," + lon;

        URL obj = new URL(urlWithQuery);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));


        message = con.getResponseMessage();
        log.info(message);

        String message = con.getResponseMessage();

        return in;
    }



    /**
     * This method converts the incoming stream to a string.
     *
     * @param in the bufferedReader
     * @return the string
     * @throws IOException the io exception
     */
    
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

        return response.toString();
    }
}
