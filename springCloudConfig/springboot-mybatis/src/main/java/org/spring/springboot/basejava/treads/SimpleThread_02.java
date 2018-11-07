package org.spring.springboot.basejava.treads;

public class SimpleThread_02 implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("this is runable interface");
        }
    }

    public static void main(String[] args) {
        SimpleThread_02 simpleThread_02 = new SimpleThread_02();
        Thread thread = new Thread(simpleThread_02,"ts");
        thread.start();
    }
}
