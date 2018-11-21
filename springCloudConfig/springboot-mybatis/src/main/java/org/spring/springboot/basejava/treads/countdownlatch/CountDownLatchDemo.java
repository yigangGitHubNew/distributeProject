package org.spring.springboot.basejava.treads.countdownlatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * 模拟集齐7颗龙珠召唤神龙
 */
public class CountDownLatchDemo {

    private static final int MAX_LENGTH = 7;
    private static CountDownLatch countDownLatch = new CountDownLatch(MAX_LENGTH);

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0;i<MAX_LENGTH;i++){
            final int index = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("集齐第"+index+"颗龙珠");
                    try {
                        Thread.sleep(Math.abs(new Random().nextInt(5000)));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        System.out.println("已经集齐7颗龙珠，可以召唤神龙啦");

    }



}
