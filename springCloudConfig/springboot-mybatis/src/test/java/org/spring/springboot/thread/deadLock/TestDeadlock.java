package org.spring.springboot.thread.deadLock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.springboot.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDeadlock {

    @Autowired
    private Deadlock deadlock;

    @Test
    public void testConnect(){
        deadlock.testConect();
    }

    @Test
    public void testDeadLock(){
        Thread t1 = new Thread(){
            public void run(){
                deadlock.queryCityById(1L);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                deadlock.updateCityById(3L);
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                deadlock.queryCityById(3L);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                deadlock.updateCityById(1L);
            }
        };
        t1.start();
        t2.start();
    }
}
