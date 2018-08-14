package spring.cloud.config.learning.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.cloud.config.learning.entity.User;
import spring.cloud.config.learning.mapper.UserMapper;
import spring.cloud.config.learning.service.UserService;

import java.util.List;

@Component
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listUsers() {
        return userMapper.listUsers();
    }
}
