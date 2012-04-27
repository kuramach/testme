package com.sample.spring;


import net.sample.spring.AppC;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;


/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:resources/applicationContext.xml")
public class AppTest
{

    @Autowired
    AppB appB;

    @Autowired
    App app;

    @Autowired
    AppC appC;

    @Test
    public void testApp()
    {
        assertNotNull(appB);
        assertNotNull(app)  ;
        assertNotNull(appC);
    }
}
