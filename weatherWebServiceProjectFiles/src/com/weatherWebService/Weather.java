package com.weatherWebService;

import com.google.gson.Gson;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.io.IOException;

/**
 * Created by scheffs on 3/28/2016.
 */

// The Java class will be hosted at the URI path "/weather"
@Path("/weather")

public class Weather extends HttpServlet
{
    private static final Logger log = Logger.getLogger("Weather");
    WeatherController wc;

    @GET
    // The Java method will produce content identified by the MIME media type "text/plain"
    @Produces("text/plain")
    public String getClichedMessage(@QueryParam("lat") String lat, @QueryParam("lon")
                                    String lon) throws Exception
    {
        String jsonResponse;
        wc = new WeatherController();
        jsonResponse = wc.printJSONResponse(wc.sendGet(lat, lon));



        // Return some cliched textual content
        return jsonResponse;
    }
}
