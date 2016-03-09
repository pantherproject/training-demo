package com.panther.demo.exercise4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ThreadLocal为变量在每个线程中都创建了一个副本，那么每个线程可以访问自己内部的副本变量。
 * Created by panther.dongdong on 2016/3/9.
 */
public class ThreadLocalSafeDemo {
    public static final int size = 10;

    public static final ExecutorService pool = Executors.newFixedThreadPool(size);

    public static ThreadLocal<Integer> integerThreadLocal = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public static void test() throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(size);
        for (int i = 0; i < size; ++i) {
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int j = 0; j < 10000; ++j) {
                            int count = integerThreadLocal.get();
                            integerThreadLocal.set(++count);
                        }
                        System.out.println(Thread.currentThread().getName() + " count:" + integerThreadLocal.get());
                    } finally {
                        latch.countDown();
                    }
                }
            });
        }

        latch.await();
        pool.shutdownNow();
        System.out.println(Thread.currentThread().getName() + " count:" + integerThreadLocal.get());
    }


    public static void main(String[] args) throws InterruptedException {
        test();
    }
}
