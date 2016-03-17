package com.panther.demo.exercise10;

/**
 * Created by panther.dongdong on 2016/3/17.
 */
public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
