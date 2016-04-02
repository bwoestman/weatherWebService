/**
 * @author jjjasonm
 *         Created on 3/22/16.
 */
public class DayOfWeather
{

    // TODO: match instance variables to keys in json?
    private String cloudCover;
    private String windSpeed;
    private String temperatureMax;
    private String temperatureMin;
    private String precipProbability;

    public String getCloudCover()
    {
        return cloudCover;
    }

    public void setCloudCover(String cloudCover)
    {
        this.cloudCover = cloudCover;
    }

    public String getWindSpeed()
    {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed)
    {
        this.windSpeed = windSpeed;
    }

    public String getTemperatureMax()
    {
        return temperatureMax;
    }

    public void setTemperatureMax(String temperatureMax)
    {
        this.temperatureMax = temperatureMax;
    }

    public String getTemperatureMin()
    {
        return temperatureMin;
    }

    public void setTemperatureMin(String temperatureMin)
    {
        this.temperatureMin = temperatureMin;
    }

    public String getPrecipProbability()
    {
        return precipProbability;
    }

    public void setPrecipProbability(String precipProbability)
    {
        this.precipProbability = precipProbability;
    }

    public String toString()
    {

        return "Wind Speed: " + getWindSpeed()
                + ", Cloudiness: " + getCloudCover()
                + ", High Temp of Day: " + getTemperatureMax()
                + ", Low Temp of Day: " + getTemperatureMin()
                + ", Precip Chance: " + getPrecipProbability();
    }
}
