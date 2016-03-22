package com.panther.demo.bridge;

/**
 * 驱动管理[特殊]
 * Created by panther.dongdong on 2016/3/21.
 */
public class AppDriverManager extends DriverManager {
    public void connect() {
        super.connect();
        System.out.println("app 驱动管理连接");
    }
}
