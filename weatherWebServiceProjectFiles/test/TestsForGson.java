import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.*;

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
                "  \"Cloudiness\": \"clouds\",\n" +
                "  \"WindSpeed\": \"windSpeed\",\n" +
                "  \"HighTemperatureOfDay\": \"highTemp\",\n" +
                "  \"LowTemperatureOfDay\": \"lowTemp\",\n" +
                "  \"ChanceOfPrecipitation\": \"precip\"\n" +
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
        assertTrue((gson.toJson(day)).equals(gsonString));
    }
}
