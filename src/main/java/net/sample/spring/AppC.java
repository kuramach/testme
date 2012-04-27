package net.sample.spring;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: kumar
 * Date: 4/27/12
 * Time: 1:38 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class AppC {

    String AppCa;
    String AppCb;

    public String getAppCb() {
        return AppCb;
    }

    public void setAppCb(String appCb) {
        AppCb = appCb;
    }

    public String getAppCa() {

        return AppCa;
    }

    public void setAppCa(String appCa) {
        AppCa = appCa;
    }
}
