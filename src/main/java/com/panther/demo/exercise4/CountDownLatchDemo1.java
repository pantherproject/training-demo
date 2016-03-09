package com.panther.demo.exercise4;

import java.util.concurrent.CountDownLatch;

/**
 * count down latch demo 1
 * Created by panther.dongdong on 2016/3/9.
 */
public class CountDownLatchDemo1 {
    public static void main(String[] args) {
        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch doneSignal = new CountDownLatch(10);

        for (int i = 0; i < 10; ++i) {
            new Thread(new Worker(startSignal, doneSignal)).start();
        }
    }


   static class Worker implements Runnable {

        private final CountDownLatch startSignal;
        private final CountDownLatch doneSignal;

        Worker(CountDownLatch startSignal, CountDownLatch doneSignal) {
            this.startSignal = startSignal;
            this.doneSignal = doneSignal;
        }

        @Override
        public void run() {
            try {
                startSignal.await();
                doWork();
                doneSignal.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        void doWork() {
            System.out.println("working....");
        }
    }
}
