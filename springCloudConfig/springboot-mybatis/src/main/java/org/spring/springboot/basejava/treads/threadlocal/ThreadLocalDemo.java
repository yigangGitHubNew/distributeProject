package org.spring.springboot.basejava.treads.threadlocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalDemo {

    private static ThreadLocal<String> threadLocal1 = new ThreadLocal<String>();
    private static ThreadLocal<String> threadLocal2 = new ThreadLocal<String>();
    private static ThreadLocal<String> threadLocal3 = new ThreadLocal<String>();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        threadLocal1.set("1231");
        threadLocal1.set("12311");
        threadLocal2.set("2341");
        threadLocal3.set("3451");
        for(int i = 0;i < 4;i++){
            int index = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    threadLocal1.set("123"+index);
                    System.out.println(Thread.currentThread().getName());
                    System.out.println(threadLocal1.get());
                }
            });
        }
        System.out.println(threadLocal1.get());
        System.out.println(threadLocal2.get());
        System.out.println(threadLocal3.get());
        new Thread().start();
        executorService.shutdown();
    }
}
