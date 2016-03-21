package com.panther.demo.bridge;

/**
 * mysql驱动
 * Created by panther.dongdong on 2016/3/21.
 */
public class MysqlDriver implements Driver {
    @Override
    public void connect() {
        System.out.println("connect mysql done!");
    }
}
