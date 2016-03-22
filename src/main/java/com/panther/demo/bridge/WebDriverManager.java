package com.panther.demo.bridge;

/**
 * web驱动管理
 * Created by panther.dongdong on 2016/3/21.
 */
public class WebDriverManager extends DriverManager {
    public void connect() {
        super.connect();
        System.out.println("web 驱动管理连接");
    }
}
