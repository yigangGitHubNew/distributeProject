package org.spring.springboot.basejava.treads.synchronize;

/**
 * Synchronized的重入锁
 */
public class SynchronizedReentry {


    public synchronized void method1(){
        System.out.println("method1...");
        method2();
    }

    public synchronized void method2(){
        System.out.println("method2...");
        method3();
    }

    public synchronized void method3(){
        System.out.println("method3...");
    }

    public static void main(String[] args) {
        final SynchronizedReentry synchronizedReentry = new SynchronizedReentry();

        for (int i = 0;i<5;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronizedReentry.method1();
                }
            }).start();
        }
    }
}
