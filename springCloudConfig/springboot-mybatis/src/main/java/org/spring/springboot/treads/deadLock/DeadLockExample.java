package org.spring.springboot.treads.deadLock;

public class DeadLockExample {

    public static void dead_lock(){
        final Object resource1 = "resource1";
        final Object resource2 = "resource2";
        Thread t1 = new Thread(){
            public void run(){
                synchronized (resource1){
                    System.out.println("thread1:locked rescource1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource2){
                        System.out.println("thread1:want locked resource2");
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                synchronized (resource2){
                    System.out.println("Thread2:locked rescource2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource1){
                        System.out.println("Thread2:locked rescource2");
                    }
                }
            }
        };
        t1.start();;
        t2.start();
    }

    public static void main(String[] args) {
        dead_lock();
    }
}
