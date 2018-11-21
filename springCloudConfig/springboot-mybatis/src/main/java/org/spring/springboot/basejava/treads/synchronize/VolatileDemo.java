package org.spring.springboot.basejava.treads.synchronize;

public class VolatileDemo {

    public volatile int count = 0;

    public void increatCount(){
        count++;
    }

    public static void main(String[] args) {
        VolatileDemo volatileDemo = new VolatileDemo();
        for(int i = 0;i<10;i++){
            int index = i;
            new Thread(new Runnable() {
                @Override
                public synchronized void run() {
                    for(int j = 0;j<1000;j++){
                        volatileDemo.increatCount();
                        System.out.println("线程名称："+Thread.currentThread().getName()+"该线程输出的结果是："+volatileDemo.count);
                    }
                }
            },"Thread_name_"+index).start();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("最终的结果"+volatileDemo.count);
    }

}
