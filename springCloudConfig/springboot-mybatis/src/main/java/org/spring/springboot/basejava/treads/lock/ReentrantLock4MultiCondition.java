package org.spring.springboot.basejava.treads.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock4MultiCondition {

    private static Lock lock = new ReentrantLock();
    private static Condition condition1 = lock.newCondition();
    private static Condition condition2 = lock.newCondition();

    public static void main(String[] args) throws InterruptedException {

        ReentrantLock4MultiCondition reentrantLock4MultiCondition = new ReentrantLock4MultiCondition();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    reentrantLock4MultiCondition.await(condition1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Thread_await_condition1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    reentrantLock4MultiCondition.await(condition2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Thread_await_condition2").start();

        Thread.sleep(2000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                reentrantLock4MultiCondition.singal(condition1);
            }
        },"Thread_signal_condition1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                reentrantLock4MultiCondition.singal(condition2);
            }
        },"Thread_signal_condition2").start();
    }

    public void await(Condition condition) throws InterruptedException {
        lock.lock();
        System.out.println("现场开始等待，线程名称："+Thread.currentThread().getName());
        condition.await();
        System.out.println("线程等待结束，线程名称："+Thread.currentThread().getName());
        lock.unlock();
    }

    public void singal(Condition condition){
        lock.lock();
        System.out.println("开始通知其他线程可以活动了，线程名称："+Thread.currentThread().getName());
        condition.signal();
        lock.unlock();
    }

}
