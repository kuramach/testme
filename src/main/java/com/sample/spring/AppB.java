package com.sample.spring;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: kumar
 * Date: 4/27/12
 * Time: 1:36 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class AppB {
    String AppBa;
    String AppBb;

    public String getAppBa() {
        return AppBa;
    }

    public void setAppBa(String appBa) {
        AppBa = appBa;
    }

    public String getAppBb() {
        return AppBb;
    }

    public void setAppBb(String appBb) {
        AppBb = appBb;
    }
}
