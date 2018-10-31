package org.spring.springboot.spring.springevent;

import org.springframework.context.ApplicationEvent;

public class SendEmailEvent extends ApplicationEvent{

    private String email;

    public SendEmailEvent(Object source, String email) {
        super(source);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
