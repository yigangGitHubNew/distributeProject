package org.spring.springboot.basejava.treads.futrue;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FutureData implements Data{

    private RealData realData = null;
    private boolean isReady = false;

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    @Override
    public String getRequest() {
        if(!isReady){
            try {
                lock.lock();
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lock.unlock();
        return realData.getRequest();
    }

    public void setRealData(RealData realData){
        lock.lock();
        if(isReady){
            return;
        }
        this.realData = realData;
        isReady = true;
        condition.signal();
        lock.unlock();
    }
}
