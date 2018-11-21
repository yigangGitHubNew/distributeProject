package org.spring.springboot.basejava.treads.futrue;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FutureMain {

    public static void main(String[] args) {

        FutureTask<String> futureTask = new FutureTask<String>(new RealData4JDK("Hello World"));
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(futureTask);

        try {
            System.out.println("模拟做其他的业务开始");
            Thread.sleep(2000);
            System.out.println("模拟做其他的业务结束，用时2秒");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(futureTask.get().toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();

    }
}
