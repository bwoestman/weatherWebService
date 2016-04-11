package com.weatherWebService;

import java.util.List;

/**
 * Created by Bdub on 4/10/16.
 */

/**
 * this class is used to store the incoming json data from DarkSky API
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
