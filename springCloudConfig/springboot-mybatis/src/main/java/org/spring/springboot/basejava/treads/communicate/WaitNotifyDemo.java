package org.spring.springboot.basejava.treads.communicate;

import java.util.ArrayList;
import java.util.List;

/**
 * wait/motify通知等待（线程间的通信机制）
 */
public class WaitNotifyDemo {

    private List<String> strings = new ArrayList<String>();

    public void add(){
        strings.add("添加元素");
    }

    public int getSize(){
        return strings.size();
    }

    public static void main(String[] args) {
        WaitNotifyDemo waitNotifyDemo = new WaitNotifyDemo();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this){
                    for(int i = 0; i < 10;i++){
                        waitNotifyDemo.add();
                        System.out.println("第"+i+"个元素添加，线程名是："+Thread.currentThread().getName()+",数组的容量是："+waitNotifyDemo.getSize());
                        try {
                            Thread.sleep(1000);
                            notify();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        },"thread_A").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this){
                    if(waitNotifyDemo.getSize() != 5){
                        System.out.println("线程名称："+Thread.currentThread().getName());
                        System.out.println("开始时间："+System.currentTimeMillis());
                    }
                }
            }
        },"Thread_B").start();
    }

}
