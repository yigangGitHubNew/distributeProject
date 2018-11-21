package org.spring.springboot.basejava.treads.lock;

import sun.awt.windows.ThemeReader;

import java.util.Date;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadAndWriteDemo {

    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    public static void main(String[] args){
        ReentrantReadAndWriteDemo reentrantReadAndWriteDemo = new ReentrantReadAndWriteDemo();
//        new Thread(() ->reentrantReadAndWriteDemo.read(),"Thread_1").start();
//        new Thread(() ->reentrantReadAndWriteDemo.write(),"Thread_read_local1").start();
//        new Thread(() ->reentrantReadAndWriteDemo.write(),"Thread_read_local2").start();
        new Thread(()->reentrantReadAndWriteDemo.write(),"Thread_read_write_1").start();
        new Thread(()->reentrantReadAndWriteDemo.read(),"Thread_read_write_2").start();
    }

    public void read(){
        reentrantReadWriteLock.readLock().lock();
        System.out.println("当前是读操作线程，线程名称："+Thread.currentThread().getName()+new Date());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        reentrantReadWriteLock.readLock().unlock();
    }

    public void write(){
        reentrantReadWriteLock.writeLock().lock();
        System.out.println("当前写操作的线程，线程名称是："+Thread.currentThread().getName()+new Date());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        reentrantReadWriteLock.writeLock().unlock();
    }

}
