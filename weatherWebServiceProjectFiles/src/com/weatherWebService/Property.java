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

    private String testProperty;

    public final static Logger log = Logger.getLogger("weatherWebService");

    public String getTestProperty() {
        return testProperty;
    }

    public void setTestProperty(String testProperty) {
        this.testProperty = testProperty;
    }

    public Property() {

        loadProperties(propertyUrl);
        setVariables();
    }

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
    private void setVariables() {

        testProperty = properties.getProperty("test");
        log.info(testProperty);
    }
}
