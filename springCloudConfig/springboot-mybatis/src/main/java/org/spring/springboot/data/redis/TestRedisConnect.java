package org.spring.springboot.data.redis;

import redis.clients.jedis.Jedis;

/**
 * 测试redis能否连通
 */
public class TestRedisConnect {

    public static void main(String[] args) {

        Jedis jedis = new Jedis("192.168.208.133",6380);
        System.out.println("connect successfully");
        System.out.println("server is running:"+jedis.ping());
        jedis.set("wyg", "www.baidu.com");
        System.out.println(jedis.get("wyg"));
    }
}
