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
     * @return cloud cover percentage of cloud cover for the day
     */
    public String getCloudCover()
    {
        return cloudCover;
    }

    /**
     * Set the value of the instance variable for cloudCover
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
     *
     * @return windspeed the windspeed for the day
     */
    public String getWindSpeed()
    {

        return windSpeed;
    }

    /**
     * Set the instance variable for windSpeed
     *
     * @param windSpeed
     */
    public void setWindSpeed(String windSpeed)
    {
        this.windSpeed = windSpeed;
    }

    /**
     * Gets the value for temperatureMax
     *
     * @return temperatureMax the high temperature for the day
     */
    public String getTemperatureMax()
    {
        return temperatureMax;
    }

    /**
     * Sets the temperatureMax instance variable
     *
     * @param temperatureMax
     */
    public void setTemperatureMax(String temperatureMax)
    {
        this.temperatureMax = temperatureMax;
    }

    /**
     * Gets the value of temperature min instance variable
     *
     * @return
     */
    public String getTemperatureMin()
    {
        return temperatureMin;
    }

    /**
     * Set method for temperatureMin instance variable
     *
     * @param temperatureMin
     */
    public void setTemperatureMin(String temperatureMin)
    {
        this.temperatureMin = temperatureMin;
    }

    /**
     * Get method for precipProbability
     *
     * @return precipProbability the chance of precipitation for the day
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
    @Override
    public String toString()
    {
        return "Wind Speed: " + getWindSpeed()
                + ", Cloudiness: " + getCloudCover()
                + ", High Temp of Day: " + getTemperatureMax()
                + ", Low Temp of Day: " + getTemperatureMin()
                + ", Precip Chance: " + getPrecipProbability();
    }
}
