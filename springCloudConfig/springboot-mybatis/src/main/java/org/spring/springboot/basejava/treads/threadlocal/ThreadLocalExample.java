package org.spring.springboot.basejava.treads.threadlocal;

import java.util.ArrayList;
import java.util.List;

/**
 * threadlocal的使用
 */
public class ThreadLocalExample {

    ThreadLocal<List<String>> listThreadLocal = new ThreadLocal<List<String>>();

    public void setListThreadLocal(List<String> strings) {
        listThreadLocal.set(strings);
    }

    public void getListThreadLocal(){
        System.out.println(java.lang.Thread.currentThread().getName());
        for (String str : listThreadLocal.get()){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        final ThreadLocalExample threadLocalExample = new ThreadLocalExample();
        new Thread(new Runnable() {
            @Override
            public void run() {
                List<String> strNames = new ArrayList<String>();
                strNames.add("张三1");
                strNames.add("李四1");
                threadLocalExample.setListThreadLocal(strNames);
                threadLocalExample.getListThreadLocal();
            }
        },"thread-local-1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                List<String> strNames = new ArrayList<String>();
                strNames.add("张三2");
                strNames.add("李四2");
                threadLocalExample.setListThreadLocal(strNames);
                threadLocalExample.getListThreadLocal();
            }
        },"thread-local-2").start();
    }


}
