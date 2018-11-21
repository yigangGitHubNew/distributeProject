package org.spring.springboot.basejava.treads.futrue;

public class Client {

    public Data getData(String param){
        FutureData futureData = new FutureData();
        new Thread(new Runnable() {
            @Override
            public void run() {
                RealData realData = new RealData(param);
                futureData.setRealData(realData);
            }
        },"thread_name_realdata").start();
        return futureData;
    }
}
