import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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

    @Test
    public void testGsonConversion() throws Exception
    {
        String json = "{\"cloudCover\":\"Cloud Cover\", \"windSpeed\":\"Wind Speed\", " +
                "\"temperatureMax\":\"High Temp\", \"temperatureMin\":\"Low Temp\", " +
                "\"precipProbabability\":\"Precipitation\"}";
        String mismatchedJson = "{\"cloudCover\":\"Clouds\", \"noVar\":\"noVar\"}";

        Gson gson = new GsonBuilder().create();
        DayOfWeather dow = gson.fromJson(json, DayOfWeather.class);
        DayOfWeather mmjDow = gson.fromJson(mismatchedJson, DayOfWeather.class);

        log.info(dow.toString());
        log.info(mmjDow.toString());
    }
}
