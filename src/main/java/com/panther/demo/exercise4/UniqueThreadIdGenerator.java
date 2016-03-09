package com.panther.demo.exercise4;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * threadLocal demo
 * Created by panther.dongdong on 2016/3/9.
 */
public class UniqueThreadIdGenerator {
    private static final AtomicInteger uniqueId = new AtomicInteger(0);

    private static final ThreadLocal<Integer> uniqueNum = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return uniqueId.getAndIncrement();
        }
    };

    public static int getCurrentThreadId() {
        return uniqueId.get();
    }
}
