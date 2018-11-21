package org.spring.springboot.basejava.treads.communicate;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class MyQueue {

    private final LinkedList<String> elements = new LinkedList<String>();
    private final AtomicInteger count = new AtomicInteger(0);
    private final int maxSize = 5;
    private final int minSize = 0;

    private final Object obj = new Object();

    public void set(String str){

        synchronized (obj){
            while (count.get() == maxSize){
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            elements.add(str);
            count.getAndIncrement();
            System.out.println("元素"+str+"被加入");
            obj.notify();
        }
    }

    public String get(){
        synchronized (obj){
            while (count.get() == minSize){
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count.getAndDecrement();
            String  str = elements.removeFirst();
            obj.notify();
            return str;
        }
    }

    public int getSize(){
        return elements.size();
    }

    public static void main(String[] args) throws InterruptedException {
        MyQueue myQueue = new MyQueue();
        initMyQueue(myQueue);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                myQueue.set("8");
                myQueue.set("9");
                System.out.println("线程"+Thread.currentThread().getName()+"向列表中添加元素，元素的个数是："+myQueue.getSize());
            }
        },"thread-name-1");

            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    myQueue.get();
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    myQueue.get();
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程"+Thread.currentThread().getName()+"消费列表中的元素，元素剩余个数是："+myQueue.getSize());

                }
            },"thread-name-2");
            t1.start();
            Thread.sleep(2000);
            t2.start();
    }

    public static void initMyQueue(MyQueue myQueue){
        myQueue.set("1");
        myQueue.set("2");
        myQueue.set("3");
        myQueue.set("4");
        myQueue.set("5");
        System.out.println("该数组的大小是："+myQueue.getSize());
    }



}
