import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.weatherWebService.DayOfWeather;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Bdub on 3/29/16.
 */
public class TestsForGson
{
    private final static Logger log = Logger.getLogger("Gson");
    private Gson gson;

    @Before
    public void initializtion()
    {
        gson = new GsonBuilder().create();
    }

    /**
     * this tests that the gson builds a proper json from the DoW object
     */

    @Test
    public void testGsonBuilder()
    {
        DayOfWeather day = new DayOfWeather();

        String gsonString = "{\n" +
                "  \"CloudCover\": \"clouds\",\n" +
                "  \"WindSpeed\": \"windSpeed\",\n" +
                "  \"TemperatureMax\": \"highTemp\",\n" +
                "  \"TemperatureMin\": \"lowTemp\",\n" +
                "  \"PrecipProbability\": \"precip\"\n" +
                "}";

        day.setPrecipProbability("precip");
        day.setCloudCover("clouds");
        day.setTemperatureMax("highTemp");
        day.setTemperatureMin("lowTemp");
        day.setWindSpeed("windSpeed");

        Gson gson = new GsonBuilder()
                .disableHtmlEscaping()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .serializeNulls()
                .create();

        log.info(gson.toJson(day));
        log.info(gsonString);
        assertTrue((gson.toJson(day)).equals(gsonString));
    }

    /**
     * this tests that a DoW object's properties are set by a json
     *
     * @throws Exception
     */

    @Test
    public void testMatchedGsonConversion() throws Exception
    {
        String json = "{" +
                "\"cloudCover\":\"Cloud Cover\"," +
                " \"windSpeed\":\"Wind Speed\", " +
                "\"temperatureMax\":\"High Temp\", " +
                "\"temperatureMin\":\"Low Temp\", " +
                "\"precipProbability\":\"Precipitation\"}";

        String toString = "Wind Speed: Wind Speed, Cloudiness: Cloud Cover, " +
                "High Temp of Day: High Temp, Low Temp of Day: Low Temp, " +
                "Precip Chance: Precipitation";

        DayOfWeather dow = gson.fromJson(json, DayOfWeather.class);

        assertTrue(toString.equals(dow.toString()));
    }

    @Test
    public void testMismatchedJsonConversion()
    {
        String mismatchedJson = "{\"" +
                "cloudCover\":\"Clouds\", \"" +
                "noVar\":\"noVar\"}";
        String toString = "Wind Speed: null, Cloudiness: Clouds, High Temp of Day: null," +
                " Low Temp of Day: null, Precip Chance: null";

        DayOfWeather mmjDow = gson.fromJson(mismatchedJson, DayOfWeather.class);

        assertTrue(toString.equals(mmjDow.toString()));
    }


}
