package org.spring.springboot.spring.springevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class SendEmailService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void sendEmail(String email){
        System.out.println("服务层发送邮件开始");
        applicationEventPublisher.publishEvent(new SendEmailEvent(this,email));
        System.out.println("服务层发送邮件结束");
    }


}
