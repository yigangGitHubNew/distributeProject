package org.spring.springboot.basejava.treads.threadlocal;

import java.util.*;

public class SimpleThreadLocal<T> {

    public Map<Thread,T> map = Collections.synchronizedMap(new HashMap<Thread,T>());

    public void set(T t){
        Thread thread = Thread.currentThread();
        if(map.get(thread) == null){
            map.put(thread, t);
        }
        map.put(thread, t);
    }

    public T get(){
        Thread thread = Thread.currentThread();
        return map.get(thread);
    }

    public static void main(String[] args) {
        ThreadLocalExample example = new ThreadLocalExample();
        new Thread(new Runnable() {
            @Override
            public void run() {
                List<String> strings = new ArrayList<String>();
                strings.add("aaa1");
                strings.add("aaa2");
                example.setListThreadLocal(strings);
                example.getListThreadLocal();
            }
        },"thread - a").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                List<String> strings = new ArrayList<String>();
                strings.add("bbb1");
                strings.add("bbb2");
                example.setListThreadLocal(strings);
                example.getListThreadLocal();
            }
        },"thread - b").start();
    }
}
