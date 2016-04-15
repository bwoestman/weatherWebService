package com.weatherWebService;

import java.util.List;

/**
 * This class is used to store the incoming json data from DarkSky API
 *
 * @author Bdub
 * @version 1.1
 * @since 4/10/16.
 */

public class ResponseData
{
    private Daily daily;

    public Daily getDaily()
    {
        return daily;
    }

    public void setDaily(Daily daily)
    {
        this.daily = daily;
    }

    /**
     * This class stores each day of weather in a list
     *
     * @author Bdub
     * @version 1.1
     * @since 4/10/16.
     *
     */
    public class Daily
    {
        private List<DayOfWeather> data;

        public List<DayOfWeather> getData()
        {
            return data;
        }

        public void setData(List<DayOfWeather> data)
        {
            this.data = data;
        }
    }
}