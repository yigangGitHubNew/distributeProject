package org.spring.springboot.basejava.treads.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockRun {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Thread(new Runnable() {
            @Override
            public void run() {
                rentrantLockMethod(lock);
            }
        },"Thread_name_1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                rentrantLockMethod(lock);
            }
        },"Thread_name_2").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                rentrantLockMethod(lock);
            }
        },"Thread_name_3").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                rentrantLockMethod(lock);
            }
        },"Thread_name_4").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                rentrantLockMethod(lock);
            }
        },"Thread_name_5").start();
    }

    public static void rentrantLockMethod(Lock lock){
        lock.lock();
        for(int i = 0; i < 5;i++){
            System.out.println("当前线程名称："+Thread.currentThread().getName()+",元素的名称："+i);
        }
        System.out.println();
        lock.unlock();
    }

}
