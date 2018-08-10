package spring.cloud.config.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.config.learning.entity.User;
import spring.cloud.config.learning.mapper.UserMapper;
import spring.cloud.config.learning.service.UserService;

import java.util.List;

@RestController
@RefreshScope
public class TestController {

    @Value("${name}")
    private String name;

    @Autowired
    private UserService userService;

    @RequestMapping("/from")
    public String from() {

        return this.name;
    }

    @RequestMapping("/listUser")
    public List<User> listUser(){
        System.out.println("enter in service method");
        List<User> users = userService.listUsers();
        System.out.println("out service method");
        return users;
    }

    public void setFrom(String from) {
        this.name = from;
    }

    public String getFrom() {
        return name;
    }
}
