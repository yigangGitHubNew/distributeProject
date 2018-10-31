package org.spring.springboot.springevent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.springboot.spring.springevent.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSendEmailService {

    @Autowired
    private SendEmailService sendEmailService;

    @Test
    public void testSendEamil(){
        sendEmailService.sendEmail("yigang_wu@126.com");
    }

}
