package com.panther.demo.exercise10;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by panther.dongdong on 2016/3/17.
 */
public class MyService {
    private Lock lock = new ReentrantLock();

    public void testMethod() {
//        lock.lock();
        synchronized (MyService.class) {
            for (int i = 0; i < 5; ++i) {
                System.out.println("ThreadName=" + Thread.currentThread().getName() + (" " + (i + 1)));
            }
        }
//        lock.unlock();
    }


    public static void main(String[] args) {
        new MyService().testMethod();
    }
}
