package com.panther.demo.exercise10;

/**
 * 重入锁
 * Created by panther.dongdong on 2016/3/17.
 */
public class ReentrantLockTest {

    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThread a1 = new MyThread(myService);
        MyThread a2 = new MyThread(myService);
        MyThread a3 = new MyThread(myService);
        MyThread a4 = new MyThread(myService);
        MyThread a5 = new MyThread(myService);
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
    }
}
