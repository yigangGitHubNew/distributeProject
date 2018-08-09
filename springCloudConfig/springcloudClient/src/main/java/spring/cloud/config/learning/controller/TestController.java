package spring.cloud.config.learning.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Value("${name}")
    private String name;

    @RequestMapping("/from")
    public String from() {

        return this.name;
    }

    public void setFrom(String from) {
        this.name = from;
    }

    public String getFrom() {
        return name;
    }
}
