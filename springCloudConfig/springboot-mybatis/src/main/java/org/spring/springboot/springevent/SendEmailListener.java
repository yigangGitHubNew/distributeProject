package org.spring.springboot.springevent;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class SendEmailListener implements ApplicationListener<SendEmailEvent> {

    @Async
    @Override
    public void onApplicationEvent(SendEmailEvent testEvent) {
        System.out.println("事件监听中开始发送邮件，邮箱是："+testEvent.getEmail());
    }
}
