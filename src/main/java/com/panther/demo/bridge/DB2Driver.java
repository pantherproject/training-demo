package com.panther.demo.bridge;

/**
 * db2驱动连接
 * Created by panther.dongdong on 2016/3/21.
 */
public class DB2Driver implements Driver {
    @Override
    public void connect() {
        System.out.println("connect db2 done!");
    }
}
