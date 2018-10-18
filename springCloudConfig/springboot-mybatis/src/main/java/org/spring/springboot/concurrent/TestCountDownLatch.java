package org.spring.springboot.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class TestCountDownLatch {
    public static void main(String[] args){
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for(int i = 0; i < threadNum; i++){
            new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            System.out.println("线程"+Thread.currentThread().getId()+"开始");
                            try {
                                Thread.sleep(1000);
                            }catch (Exception e){
                                e.printStackTrace();
                            }
                            System.out.println("线程"+Thread.currentThread().getId()+"已经到达终点");
                            countDownLatch.countDown();
                        }
                    }
            ).start();
        }
        try {
            countDownLatch.await();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("线程计数结束");
    }
}
