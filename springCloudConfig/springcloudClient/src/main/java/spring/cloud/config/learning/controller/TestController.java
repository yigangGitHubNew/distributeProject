package spring.cloud.config.learning.controller;

import groovy.util.logging.Slf4j;
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
@Slf4j
public class TestController {

    @Value("${name}")
    private String name;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String userName;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${mybatis.typeAliasesPackage}")
    private String typeAliasesPackagel;

    @Value("${mybatis.mapperLocations}")
    private String mapperLocations;

    @Autowired
    private UserService userService;

    @RequestMapping("/from")
    public String from() {
        System.out.println("url:"+url+" username:"+userName+" password:"+password+" driverClassName:"+driverClassName+
                " typeAliasesPackagel:"+typeAliasesPackagel+" mapperLocations:"+mapperLocations);
        return this.name;
    }

    @RequestMapping("/listUser")
    public List<User> listUser(){
        System.out.println("url:"+url+" username:"+userName+" password:"+password+" driverClassName:"+driverClassName+
                " typeAliasesPackagel:"+typeAliasesPackagel+" mapperLocations:"+mapperLocations);
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
