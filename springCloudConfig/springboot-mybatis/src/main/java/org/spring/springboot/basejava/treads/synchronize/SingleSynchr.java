package org.spring.springboot.basejava.treads.synchronize;

public class SingleSynchr {

    private SingleSynchr(){}

    public static SingleSynchr getInstance(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new SingleSynchr();
    }

    public void method(){
        System.out.println("method is print");
    }
}
