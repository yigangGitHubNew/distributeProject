package org.spring.springboot.basejava.treads.synchronize;

/**
 * 可重入锁的继承
 */
public class SynchrDubbo {

    static class Main{
        int count = 5;
        public synchronized void operationSub(){
            count--;
            System.out.println("Main class print count is "+ count);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Sub extends Main{
        public synchronized void operationSub(){
            while (count > 0){
                count--;
                System.out.println("Sub print count is "+count);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public static void main(String[] args) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Sub sub = new Sub();
                    sub.operationSub();
                }
            }).start();
        }
    }


}
