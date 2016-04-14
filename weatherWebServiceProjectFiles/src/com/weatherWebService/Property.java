package com.weatherWebService;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Properties;

/**
 * @author jjjasonm
 *         Created on 4/8/16.
 */
public class Property {

    private Properties properties;
    private String propertyUrl = "/weather.properties";
    private String projectName;
    private String url;
    private String forecastType;
    private String key;
    private String request;
    public final static Logger log = Logger.getLogger("com.weatherWebService.Property");


    /**
     * Constructor for the property class. It loads the properties and assigns the value form the properties file
     * to instance variables.
     */
    public Property() {

        loadProperties(propertyUrl);
        setRequest(properties.getProperty("request.method"));
        setProjectName(properties.getProperty("project.name"));
        setUrl(properties.getProperty("url"));
        setForecastType(properties.getProperty("forecast.type"));
        setKey(properties.getProperty("api.key"));


    }

    /**
     * Get the value of the project name variable
     *
     * @return projectName the name of the project from property file
     */
    public String getProjectName() {

        return projectName;
    }

    /**
     *
     * @param projectName
     */
    private void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     */
    private void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     */
    public String getRequest() {
        return request;
    }

    /**
     *
     * @param request
     */
    private void setRequest(String request) {

        this.request = request;
    }

    /**
     *
     * @return
     */
    public Properties getProperties() {
        return properties;
    }

    public String getKey() {
        return key;
    }

    private void setKey(String key) {
        this.key = key;
    }

    public String getForecastType() {
        return forecastType;
    }

    private void setForecastType(String forecastType) {
        this.forecastType = forecastType;
    }


    /**
     *
     * @param propertiesFilePath
     */
    private void loadProperties(String propertiesFilePath) {

        properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream(propertiesFilePath));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
