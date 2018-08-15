package spring.cloud.config.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.config.learning.entity.User;
import spring.cloud.config.learning.service.UserService;
import spring.cloud.config.learning.service.impl.RedisServiceImpl;

import java.util.List;

@RestController
@RefreshScope
public class TestController {

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

//    @Autowired
//    private RedisConfig redisConfig;



    @Autowired
    private UserService userService;

    @Autowired
    private RedisServiceImpl redisService;

    @RequestMapping("/fromService")
    public String from() {
        System.out.println("url:"+url+" username:"+userName+" password:"+password+" driverClassName:"+driverClassName+
                " typeAliasesPackagel:"+typeAliasesPackagel+" mapperLocations:"+mapperLocations);
//        redisConfig.printParams();
        List<User> users = userService.listUsers();
        redisService.set("user", users,60);
        List<User> users1 = redisService.get("user",List.class);
        System.out.println(users1);
        return this.userName;
    }

    @RequestMapping("/listUserFromService")
    public List<User> listUser(){

        System.out.println("调用方法：enter in service method");
        List<User> users1 = redisService.get("user",List.class);
        if(!CollectionUtils.isEmpty(users1)){
            System.out.println("这个listUser是从redis缓存取出来的");
            return users1;
        }
        System.out.println("这个listUser 是从数据库中取出来的");
        List<User> users = userService.listUsers();
        System.out.println("out service method");
        return users;
    }

    public void setFrom(String from) {
        this.userName = from;
    }

    public String getFrom() {
        return userName;
    }
}
