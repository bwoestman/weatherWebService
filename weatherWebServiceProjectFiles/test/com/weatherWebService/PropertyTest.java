package com.weatherWebService;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;


/**
 * @author jjjasonm
 *         Created on 4/8/16.
 */
public class PropertyTest {

    private final static Logger log = Logger.getLogger("PropertyTest");
    Property property;

    @Before
    public void setUp() {

        property = new Property();
    }

    @Test
    public void testLoadProperties() throws Exception {

        assertNotNull("Properties path is incorrect", property.getProperties());
    }

    @Test
    public void checkProjectNameVariable() {

        Property property = new Property();
        String test = property.getProjectName();
        assertTrue(test.equals("Weather Web Service"));
    }
}