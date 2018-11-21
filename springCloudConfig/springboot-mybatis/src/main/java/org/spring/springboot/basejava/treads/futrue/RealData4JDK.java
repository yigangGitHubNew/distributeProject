package org.spring.springboot.basejava.treads.futrue;

import java.util.concurrent.Callable;

public class RealData4JDK implements Callable<String> {

    private String result = null;

    public RealData4JDK(String result){
        this.result = result;
    }

    @Override
    public String call() throws Exception {
        System.out.println("模拟处理真是数据开始");
        Thread.sleep(5000);
        System.out.println("模拟处理真是数据结束，用了6秒");
        return result;
    }
}
