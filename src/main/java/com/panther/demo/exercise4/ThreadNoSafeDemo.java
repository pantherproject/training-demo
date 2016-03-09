package com.panther.demo.exercise4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程安全的 解决方案
 * Created by panther.dongdong on 2016/3/9.
 */
public class ThreadNoSafeDemo {

    private static int count = 0;

    private static final int size = 10;

    private static final ExecutorService pool = Executors.newFixedThreadPool(size);

    public static void test() throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(size);
        for (int i = 0; i < size; ++i) {
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int j = 0; j < 10000; ++j) {
                            synchronized (ThreadNoSafeDemo.class) {
                                count++;
                            }
                        }
                    } finally {
                        latch.countDown();
                    }
                }
            });
        }
        latch.await();
        pool.shutdownNow();
        System.out.println(count);
    }

    public static void main(String[] args) {
        try {
            ThreadNoSafeDemo.test();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
