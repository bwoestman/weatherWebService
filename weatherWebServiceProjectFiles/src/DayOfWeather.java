/**
 * @author jjjasonm
 *         Created on 3/22/16.
 */
public class DayOfWeather {

    private String cloudiness;
    private String windSpeed;
    private String highTemperatureOfDay;
    private String lowTemperatureOfDay;
    private String chanceOfPrecipitation;

    public String getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(String cloudiness) {
        this.cloudiness = cloudiness;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getHighTemperatureOfDay() {
        return highTemperatureOfDay;
    }

    public void setHighTemperatureOfDay(String highTemperatureOfDay) {
        this.highTemperatureOfDay = highTemperatureOfDay;
    }

    public String getLowTemperatureOfDay() {
        return lowTemperatureOfDay;
    }

    public void setLowTemperatureOfDay(String lowTemperatureOfDay) {
        this.lowTemperatureOfDay = lowTemperatureOfDay;
    }

    public String getChanceOfPrecipitation() {
        return chanceOfPrecipitation;
    }

    public void setChanceOfPrecipitation(String chanceOfPrecipitation) {
        this.chanceOfPrecipitation = chanceOfPrecipitation;
    }

    public String toString() {

        return "Wind Speed: " + getWindSpeed()
                + "Cloudiness: " + getCloudiness()
                + "High Temp of Day: " + getHighTemperatureOfDay()
                + "Low Temp of Day: " + getLowTemperatureOfDay()
                + "Precip Chance: " + getChanceOfPrecipitation();
    }
}
