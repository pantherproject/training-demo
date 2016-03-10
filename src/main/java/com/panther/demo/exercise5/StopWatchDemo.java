package com.panther.demo.exercise5;

import com.google.common.base.Stopwatch;
import com.panther.demo.exercise4.ThreadNoSafeDemo;

import java.util.concurrent.TimeUnit;

/**
 * count time demo
 * Created by panther.dongdong on 2016/3/9.
 */
public class StopWatchDemo {
    public static void main(String[] args) throws InterruptedException {
        Stopwatch stopwatch = Stopwatch.createStarted();
        Thread.sleep(2000);
        stopwatch.stop();
        long nanos = stopwatch.elapsed(TimeUnit.MILLISECONDS);
        System.out.println(nanos);
        stopwatch.start();
        Thread.sleep(1000);
        stopwatch.stop();
        System.out.println(stopwatch.elapsed(TimeUnit.MILLISECONDS));
    }
}
