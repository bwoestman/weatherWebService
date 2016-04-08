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
    private String testProperty;

    public final static Logger log = Logger.getLogger("com.weatherWebService.Property");

    public Property() {

        loadProperties(propertyUrl);
        //setVariables();
        setTestProperty(properties.getProperty("test"));
        setProjectName(properties.getProperty("project.name"));
        setUrl(properties.getProperty("url"));

    }

    public String getProjectName() {
        return projectName;
    }

    private void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getUrl() {
        return url;
    }

    private void setUrl(String url) {
        this.url = url;
    }

    public String getTestProperty() {
        return testProperty;
    }

    private void setTestProperty(String testProperty) {

        this.testProperty = testProperty;
    }

    public Properties getProperties() {
        return properties;
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
}
