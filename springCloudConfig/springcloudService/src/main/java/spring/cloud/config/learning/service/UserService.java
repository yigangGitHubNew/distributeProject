package spring.cloud.config.learning.service;

import spring.cloud.config.learning.entity.User;

import java.util.List;

public interface UserService {

    List<User> listUsers();
}
