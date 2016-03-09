package com.panther.demo.exercise4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * count down latch demo 2
 * Created by panther.dongdong on 2016/3/9.
 */
public class CountDownLatchDemo2 {
    public static void main(String[] args) {
        CountDownLatch doneSignal = new CountDownLatch(10);
        Executor executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; ++i) {
            executor.execute(new WorkerRunnable(doneSignal, i));
        }
    }


    static class WorkerRunnable implements Runnable {

        private final CountDownLatch doneSignal;

        private final int i;

        WorkerRunnable(CountDownLatch doneSignal, int i) {
            this.doneSignal = doneSignal;
            this.i = i;
        }

        @Override
        public void run() {
            try {
                doWork(i);
                doneSignal.countDown();
            } catch (Exception e) {

            }
        }

        void doWork(int i) {
            System.out.println(i + "working....");
        }
    }
}
