package com.weatherWebService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by scheffs on 3/28/2016.
 */

/**
 * this class will be hosted at the URI path "/weather"
 *
 */
@Path("/weather")

public class Weather extends HttpServlet
{
    private static final Logger log = Logger.getLogger("Weather");
    //("com.weatherWebService.Weather");

    @GET
    /**
     * This method will produce content identified by the MIME media type "text/plain"
     * Gets cliched message.
     *
     * @param lat the lat
     * @param Ion the Ion
     * @retun jsonResponse the json response
     * @throws Exception the exception
     */
    @Produces("application/json")
    public String getClichedMessage(@QueryParam("lat") String lat, @QueryParam("lon")
            String lon) throws Exception
    {
        String jsonResponse;
        Gson gson = new GsonBuilder().create();
        WeatherController wc = new WeatherController();
        BufferedReader in;
        String jsonDarkSky;

        //send GET to DarkSky API and return a json string
        jsonResponse = wc.printJSONResponse(wc.sendGet(lat, lon));
        jsonDarkSky = wc.getResponseJson();

        //store the reformatted response json
        ResponseData response = gson.fromJson(jsonDarkSky, ResponseData.class);

        //convert response back to a string for output to the page
        jsonResponse = gson.toJson(response);

        //return json string response
        return jsonResponse;
    }
}
