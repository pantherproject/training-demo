package com.panther.demo.exercise4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * AtomicInteger，一个提供原子操作的Integer的类。在Java语言中，+i和i+操作并不是线程安全的，在使用的时候，不可避免的会用到synchronized关键字。而AtomicInteger则通过一种线程安全的加减操作接口。
 * Created by panther.dongdong on 2016/3/9.
 */
public class AtomicDemo {

    private static int count = 0;

    private static final int size = 10;

    public static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static final ExecutorService pool = Executors.newFixedThreadPool(size);

    public static void test() throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(size);

        for (int i = 0; i < size; ++i) {
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int j = 0; j < 10000; ++j) {
                            atomicInteger.incrementAndGet();
                        }
                    } finally {
                        latch.countDown();
                    }
                }
            });
        }

        latch.await();
        pool.shutdownNow();
        System.out.println(atomicInteger);
    }

    public static void main(String[] args) {
        try {
            AtomicDemo.test();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//AtomicInteger并发操作:http://hittyt.iteye.com/blog/1130990