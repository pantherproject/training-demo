package com.panther.demo.bridge;

/**
 * 结构型模式
 * 客户端连接
 * Created by panther.dongdong on 2016/3/21.
 */
public class Client {
    public static void main(String[] args) {
        DriverManager driverManager = new AppDriverManager();

        //mysql连接
        Driver driver = new MysqlDriver();
        driverManager.setDriver(driver);
        driverManager.connect();

        //db2连接
        Driver driver1 = new OracleDriver();
        driverManager.setDriver(driver1);
        driverManager.connect();


        driverManager = new WebDriverManager();

        //mysql连接
        driverManager.setDriver(driver);
        driverManager.connect();

        //db2连接
        driverManager.setDriver(driver1);
        driverManager.connect();
    }
}