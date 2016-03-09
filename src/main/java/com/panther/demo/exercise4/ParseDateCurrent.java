package com.panther.demo.exercise4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ThreadLocal的使用
 * 如果当前线程不持有SimpleDateformat对象实例，那么就新建一个并把它设置当当前线程中，如果已经持有，则直接使用。
 * <p/>
 * 我们可以看出为为每一个线程人手分配一个对象的工作并不是由ThreadLocal来完成的，而是需要应用层保证的。如果在应用上为每个线程分配了相同的对象实例，那么ThreadLocal也不能保证线程的安全。
 * Created by panther.dongdong on 2016/3/9.
 */
public class ParseDateCurrent implements Runnable {
    private static final ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<SimpleDateFormat>();

    private int second = 0;

    public ParseDateCurrent(int second) {
        this.second = second;
    }

    @Override
    public void run() {
        try {
            if (threadLocal.get() == null) {
                threadLocal.set(new SimpleDateFormat("yyy-MM-dd HH:mm:ss"));
            }
            Date date = threadLocal.get().parse("2016-03-07 22:00:" + second % 60);
            System.out.println(second + ":" + date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; ++i) {
            executorService.execute(new ParseDateCurrent(i));
        }
        System.out.println("end");
    }
}
