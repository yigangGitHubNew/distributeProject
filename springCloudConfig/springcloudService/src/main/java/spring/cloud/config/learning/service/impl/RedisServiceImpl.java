package spring.cloud.config.learning.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisServiceImpl {
    @Autowired
    private StringRedisTemplate redisTemplate;

    private static final long defaultTime = 600;

    /**
     * 将 key，value 存放到redis数据库中，默认设置过期时间为600秒
     *
     * @param key
     * @param value
     */
    public void set(String key, Object value) {
        redisTemplate.opsForValue().set(key, JSONArray.toJSONString(value), defaultTime, TimeUnit.SECONDS);
    }

    /**
     * 将 key，value 存放到redis数据库中，设置过期时间单位是秒
     *
     * @param key
     * @param value
     * @param exceedTime
     */
    public void set(String key, Object value, long exceedTime) {
        redisTemplate.opsForValue().set(key, JSONArray.toJSONString(value), exceedTime, TimeUnit.SECONDS);
    }

    /**
     * 判断 key 是否在 redis 数据库中
     * @param key
     * @return
     */
    public boolean exists(String key) {
        return redisTemplate.hasKey(key);
    }

    public <T> T get(String key,Class <T> clazz){
        String s = redisTemplate.opsForValue().get(key);
        if(!StringUtils.isEmpty(s)){
            return JSONArray.toJavaObject(JSONArray.parseArray(s), clazz);
        }
        return null;
    }

    public String get(String key){
        return redisTemplate.opsForValue().get(key);
    }

    public void delete(String key){
        redisTemplate.delete(key);
    }

}
