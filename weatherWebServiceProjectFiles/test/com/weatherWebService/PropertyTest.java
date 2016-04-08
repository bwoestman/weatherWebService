package com.weatherWebService;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;


/**
 * @author jjjasonm
 *         Created on 4/8/16.
 */
public class PropertyTest {

    @Test
    public void testLoadProperties() throws Exception {

    }

    @Test
    public void testPropertiesVariables() {
        Property property = new Property();

        String test = property.getTestProperty();
        assertTrue(test.equals("test"));
    }


}