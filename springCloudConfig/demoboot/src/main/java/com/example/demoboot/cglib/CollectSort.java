package com.example.demoboot.cglib;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectSort {

    public static void main(String[] args) {

        List<User> users = new ArrayList<User>();
        User user = new User();
        user.setName("1");
        user.setAge("1");
        User user1 = new User();
        user1.setName("2");
        user1.setAge("5");
        User user2 = new User();
        user2.setAge("4");
        users.add(user);
        users.add(user1);
        users.add(user2);
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return getWeight(o1) - getWeight(o2);
            }

            private int getWeight(User user) {


                    int weight = -10;
                    if (!StringUtils.isEmpty(user.getName())) {
                        weight = weight + 5;
                    }
                    return weight;
            }
        });

        for(User _user :users){
            System.out.println(_user.getAge());
        }
    }

    static class User{
        String name;
        String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }
}
