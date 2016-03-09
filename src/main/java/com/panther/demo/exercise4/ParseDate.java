package com.panther.demo.exercise4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by panther.dongdong on 2016/3/9.
 */
public class ParseDate implements Runnable {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private int second = 0;

    public ParseDate(int second) {
        this.second = second;
    }

    @Override
    public void run() {
        try {
            Date date = sdf.parse("2016-03-07 22:00:" + second % 60);
            System.out.println(second + ":" + date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; ++i) {
            executorService.execute(new ParseDate(i));
        }
        System.out.println("end");
    }
}
