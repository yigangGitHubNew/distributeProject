package spring.cloud.config.learning.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;
import spring.cloud.config.learning.entity.RedisObjectSerializer;
import spring.cloud.config.learning.entity.User;

/**
 * redis 配置文件
 */
@Component
@Configuration
@PropertySource("classpath:redisconfig.properties")
public class RedisConfig {

    @Value("${spring.redis.host}")
    private String host;
    @Value("${spring.redis.port}")
    private int port;
    @Value("${spring.redis.timeout}")
    private int timeout;

    public void printParams(){
        System.out.println("host is :"+host+",port is :"+port+", timeout is :"+timeout);
    }
}
