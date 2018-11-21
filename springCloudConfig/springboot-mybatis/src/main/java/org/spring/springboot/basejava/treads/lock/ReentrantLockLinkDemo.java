package org.spring.springboot.basejava.treads.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockLinkDemo {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockLinkDemo reentrantLockLinkDemo = new ReentrantLockLinkDemo();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    reentrantLockLinkDemo.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Thread_name_1").start();
        Thread.sleep(1000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                reentrantLockLinkDemo.singal();
            }
        },"Thread_name_2").start();
    }

    public void await() throws InterruptedException {
        lock.lock();
        System.out.println("开始等待，当前线程名称："+Thread.currentThread().getName());
        condition.await();
        System.out.println("等待结束，当前线程名称："+Thread.currentThread().getName());
        lock.unlock();
    }

    public void singal(){
        lock.lock();
        condition.signal();
        System.out.println("通知其他等待线程恢复，当前线程名称："+Thread.currentThread().getName());
        lock.unlock();
    }

}
