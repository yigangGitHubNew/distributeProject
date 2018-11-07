package org.spring.springboot.basejava.treads;

public class SimpleThread_01 extends Thread{

    @Override
    public void run(){
        while (true){
            System.out.println(currentThread().getName());
        }
    }

    public static void main(String[] args) {
        SimpleThread_01 simpleThread_01 = new SimpleThread_01();
        simpleThread_01.start();
    }
}
