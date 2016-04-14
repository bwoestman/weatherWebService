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
     * Set project name variable
     *
     * @param projectName name of project from properties class
     */
    private void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * Get value of url instance variable
     *
     * @return url the url of the request
     */
    public String getUrl() {
        return url;
    }

    /**
     * Set the url from the property file
     *
     * @param url the url for the request
     */
    private void setUrl(String url) {
        this.url = url;
    }

    /**
     *  Get the type of the request
     *
     * @return request the type of request
     */
    public String getRequest() {
        return request;
    }

    /**
     * Set the request type
     *
     * @param request sets to get or post
     */
    private void setRequest(String request) {

        this.request = request;
    }

    /**
     * get properties from the properties file
     *
     * @return properties the key/values from the file
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     * gets the api key from properties file
     *
     * @return key the api key
     */
    public String getKey() {
        return key;
    }

    /**
     * set the api key from value in the properties file
     *
     * @param key the api key for the request
     */
    private void setKey(String key) {
        this.key = key;
    }

    /**
     * Get the forecast type for the day
     *
     * @return forecastType the type of forecast you are looking for
     */
    public String getForecastType() {
        return forecastType;
    }

    /**
     *  Sets the type of forecast requested
     *
     * @param forecastType the vlaue set in the properties file
     */
    private void setForecastType(String forecastType) {
        this.forecastType = forecastType;
    }


    /**
     *  load all the key and values form the weather.properties file
     *
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
