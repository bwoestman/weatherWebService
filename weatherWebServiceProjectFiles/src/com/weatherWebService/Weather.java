package com.weatherWebService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServlet;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.io.BufferedReader;

/**
 * This class will be hosted at the URI path "/weather". It takes the parameters and send the parameters
 * to the dark skies api.
 *
 * @author scheffs
 * @version 1.0
 * @since 3/28/2016
 */

@Path("/weather")

public class Weather extends HttpServlet
{
    private static final Logger log = Logger.getLogger("com.weatherWebService.Weather");

    @GET
    /**
     * This method will produce content identified by the MIME media type "text/plain"
     * Gets cliched message.
     *
     * @param lat the lat
     * @param Ion the Ion
     * @return jsonResponse the json response
     * @throws Exception the exception
     */
    @Produces("application/json")
    public String getClichedMessage(@QueryParam("lat") String lat, @QueryParam("lon")
            String lon) throws Exception
    {
        if (lat != null || lon != null)
        {
            String jsonResponse;
            Gson gson = new GsonBuilder().create();
            WeatherController wc = new WeatherController();
            BufferedReader in;
            String jsonDarkSky;

            //send GET to DarkSky API and return a json string
            wc.printJSONResponse(wc.sendGet(lat, lon));
            jsonDarkSky = wc.getResponseJson();

            //store the reformatted response json
            ResponseData response = gson.fromJson(jsonDarkSky, ResponseData.class);

            //convert response back to a string for output to the page
            jsonResponse = gson.toJson(response);

            //return json string response
            //Show an error in case the service is down
            if (wc.getMessage().equals("OK"))
            {
                return jsonResponse;
            } else
            {
                return "The server encountered and error processing the request, Please try again later.";
            }
        }
        else
        {
            return "You must enter longitude and latitude.  See user guide.";
        }
    }
}
