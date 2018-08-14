package spring.cloud.config.learning.mapper;

import spring.cloud.config.learning.entity.User;

import java.util.List;

public interface UserMapper {

    public List<User> listUsers();
}
