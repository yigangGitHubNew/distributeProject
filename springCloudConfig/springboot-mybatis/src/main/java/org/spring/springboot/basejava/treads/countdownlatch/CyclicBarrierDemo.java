package org.spring.springboot.basejava.treads.countdownlatch;

import java.util.Random;
import java.util.concurrent.*;

/**
 * 模拟集齐7颗龙珠召唤神龙
 */
public class CyclicBarrierDemo {

    private static final int MAX_LENGTH = 7;
    public static void main(String[] args) throws InterruptedException {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(MAX_LENGTH, new Runnable() {
            @Override
            public void run() {
                System.out.println("七位法师集合完毕之后，出发去寻找龙珠");
                callDragon();
            }
        });

        for(int i = 0;i<MAX_LENGTH;i++){
            final int index = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("召集"+index+"位法师");
                    try {
                        Thread.sleep(Math.abs(new Random().nextInt(5000)));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

    }

    private static void callDragon(){

        CyclicBarrier cyclicBarrier = new CyclicBarrier(MAX_LENGTH, new Runnable() {
            @Override
            public void run() {
                System.out.println("集齐七颗龙珠可以召唤神龙");
            }
        });

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
                    try {
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }



}
