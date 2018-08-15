package spring.cloud.config.learning.service.hystrix.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import spring.cloud.config.learning.service.hystrix.ComputeService;

@Component
public class ComputeServiceImpl implements ComputeService {
    @Override
    public Integer add(@RequestParam(value = "a")Integer a, @RequestParam(value = "b")Integer b) {
        return -9999;
    }
}
