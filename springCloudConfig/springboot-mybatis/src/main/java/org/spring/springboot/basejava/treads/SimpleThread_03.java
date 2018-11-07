package org.spring.springboot.basejava.treads;

public class SimpleThread_03 extends Thread {

    int count = 5;

    @Override
    public synchronized void run(){
        count--;
        System.out.println("线程名称是"+currentThread().getName()+"count："+count);
    }

    public static void main(String[] args) throws InterruptedException {
        SimpleThread_03 simpleThread_03 = new SimpleThread_03();
        for(int i = 0; i < 5;i++){
            Thread thread = new Thread(simpleThread_03,"线程"+i);
            thread.start();
        }
//        Thread thread = new Thread(simpleThread_03,"03");
//        Thread thread1 = new Thread(simpleThread_03,"031");
//        Thread thread2 = new Thread(simpleThread_03,"032");
//        Thread thread3 = new Thread(simpleThread_03,"033");
//        thread.start();
//        thread1.start();
//        thread2.start();;
//        thread3.start();
    }


}
