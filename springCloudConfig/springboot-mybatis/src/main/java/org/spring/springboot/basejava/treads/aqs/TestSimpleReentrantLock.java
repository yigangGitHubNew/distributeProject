package org.spring.springboot.basejava.treads.aqs;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class TestSimpleReentrantLock {

    public static void main(String[] args) {
        Lock lock = new SimpleReentrantLock();
        Condition condition = lock.newCondition();

        new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                System.out.println("线程名称："+Thread.currentThread().getName()+",开始进入等待");
                try {
                    condition.await();
                    System.out.println("线程名称："+Thread.currentThread().getName()+",结束进入等待");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.unlock();
            }
        },"Thread_name_1").start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程名称："+Thread.currentThread().getName()+",开始进入通知");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.lock();
                condition.signal();
                System.out.println("线程名称："+Thread.currentThread().getName()+",结束进入通知，过5秒结束");
                lock.unlock();
            }
        },"Thread_name_2").start();

    }


}
