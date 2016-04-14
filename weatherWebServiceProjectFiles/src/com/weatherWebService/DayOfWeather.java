package com.weatherWebService;

/**
 * This class will hold get the information from the response. The instance variables will match
 * the keys from the response.
 *
 * @author jjjasonm
 *         Created on 3/22/16.
 */
public class DayOfWeather
{

    private String cloudCover;
    private String windSpeed;
    private String temperatureMax;
    private String temperatureMin;
    private String precipProbability;


    /**
     * Returns the value of the instance variable cloudCover
     *
     * @return cloud cover
     */
    public String getCloudCover()
    {
        return cloudCover;
    }

    /**
     *
     *
     * @param cloudCover
     */
    public void setCloudCover(String cloudCover)
    {

        this.cloudCover = cloudCover;
    }

    /**
     *
     * Returns the value of the instance variable windSpeed
     * @return
     */
    public String getWindSpeed()
    {

        return windSpeed;
    }

    /**
     *
     * @param windSpeed
     */
    public void setWindSpeed(String windSpeed)
    {
        this.windSpeed = windSpeed;
    }

    /**
     *
     * @return
     */
    public String getTemperatureMax()
    {
        return temperatureMax;
    }

    /**
     *
     * @param temperatureMax
     */
    public void setTemperatureMax(String temperatureMax)
    {
        this.temperatureMax = temperatureMax;
    }

    /**
     *
     * @return
     */
    public String getTemperatureMin()
    {
        return temperatureMin;
    }

    public void setTemperatureMin(String temperatureMin)
    {
        this.temperatureMin = temperatureMin;
    }

    /**
     * Get method for precipProbability
     *
     * @return value of precipProbability
     */
    public String getPrecipProbability()
    {
        return precipProbability;
    }

    /**
     * Set method for precipProbability
     *
     * @param precipProbability value to set instance variable
     */
    public void setPrecipProbability(String precipProbability)
    {
        this.precipProbability = precipProbability;
    }

    /**
     * This method is used to debugging for the class
     *
     * @return The string content of all instance variables
     */
    public String toString()
    {

        return "Wind Speed: " + getWindSpeed()
                + ", Cloudiness: " + getCloudCover()
                + ", High Temp of Day: " + getTemperatureMax()
                + ", Low Temp of Day: " + getTemperatureMin()
                + ", Precip Chance: " + getPrecipProbability();
    }
}
