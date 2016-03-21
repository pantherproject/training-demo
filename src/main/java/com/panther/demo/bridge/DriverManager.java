package com.panther.demo.bridge;

/**
 * 驱动管理
 * Created by panther.dongdong on 2016/3/21.
 */
public abstract class DriverManager {
    private Driver driver;

    public void connect() {
        driver.connect();
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
