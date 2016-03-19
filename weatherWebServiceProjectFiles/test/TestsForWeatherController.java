import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Bdub on 3/18/16.
 */
public class TestsForWeatherController
{
    public final static Logger log = Logger.getLogger("weatherWebService");

    @Test
    public void testResponseOk() throws Exception
    {
        WeatherController weatherController = new WeatherController();
        int response = weatherController.sendGet();
        assertTrue(response == 200);
    }

}
