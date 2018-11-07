package org.spring.springboot.basejava.treads.synchronize;

public class TestSingleSynchr {

    public static void main(String[] args) {
        for(int i = 0;i<1000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    SingleSynchr singleSynchr = SingleSynchr.getInstance();
                    singleSynchr.method();
                }
            }).start();
        }
    }
}
