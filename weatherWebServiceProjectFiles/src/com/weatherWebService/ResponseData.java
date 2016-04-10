package com.weatherWebService;

import java.util.List;

/**
 * Created by Bdub on 4/10/16.
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
        private List<Data> data;

        public List<Data> getData()
        {
            return data;
        }

        public void setData(List<Data> data)
        {
            this.data = data;
        }
    }

    public class Data
    {
        private String cloudCover;
        private String windSpeed;
        private String temperatureMin;
        private String temperatureMax;
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

        public String getTemperatureMin()
        {
            return temperatureMin;
        }

        public void setTemperatureMin(String temperatureMin)
        {
            this.temperatureMin = temperatureMin;
        }

        public String getTemperatureMax()
        {
            return temperatureMax;
        }

        public void setTemperatureMax(String temperatureMax)
        {
            this.temperatureMax = temperatureMax;
        }

        public String getPrecipProbability()
        {
            return precipProbability;
        }

        public void setPrecipProbability(String precipProbability)
        {
            this.precipProbability = precipProbability;
        }
    }
}
