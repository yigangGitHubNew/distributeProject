package org.spring.springboot.basejava.treads.pool;

import java.util.concurrent.*;

public class ThreadPoolDemo {

    public static void main(String[] args) {
        /*创建线程池并且使用
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for(int i = 0;i<10;i++){
            int index = i;
            executorService.submit(()-> System.out.println("i "+index+" executorService，线程名称："+Thread.currentThread().getName()));
        }
        executorService.shutdown();
        */

        /*方法2
        ExecutorService executorService = new ThreadPoolExecutor(2, 2,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(10));
        for(int i = 0;i<10;i++){
            int index = i;
            executorService.submit(()-> System.out.println("i "+index+" executorService"));
        }
        executorService.shutdown();
        */

        /*
        ExecutorService executorService = new ThreadPoolExecutor(2, 2,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(10),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        for(int i = 0;i<10;i++){
            int index = i;
            executorService.submit(()-> System.out.println("i "+index+" executorService"));
        }
        executorService.shutdown();
        */

        /*使用submit不抛异常
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for(int i = 0;i < 4;i++){
            int index = i;
            executorService.submit(()-> divTask(100, index));
        }
        executorService.shutdown();
        */

        /*使用submit但是使用future.get()方法抛出异常
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for(int i = 0;i < 4;i++){
            int index = i;
            Future<?> future = executorService.submit(()-> divTask(100, index));
            try {
                future.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
        */

        /*使用execute方法，可以在抛异常的时候进行捕获
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for(int i = 0;i < 6;i++){
            int index = i;
            executorService.execute(()-> divTask(100, index));
        }
        executorService.shutdown();
        */

    }

    private static void divTask(int a,int b){
        double result = a/b;
        System.out.println(result);
    }
}
