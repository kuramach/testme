package com.sample.spring;

import net.sample.spring.AppC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@Component
public class App 
{
    String AppB;
    String AppA;

    @Autowired
    AppC appC;

    public String getAppB() {
        return AppB;
    }

    public void setAppB(String appB) {
        AppB = appB;
    }

    public String getAppA() {
        return AppA;
    }

    public void setAppA(String appA) {
        AppA = appA;
    }

    public String getAppCVal() {
        return appC.getAppCa();
    }
}
