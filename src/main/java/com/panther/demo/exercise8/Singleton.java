package com.panther.demo.exercise8;

/**
 * 单例模式
 * Created by panther.dongdong on 2016/3/14.
 */
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
