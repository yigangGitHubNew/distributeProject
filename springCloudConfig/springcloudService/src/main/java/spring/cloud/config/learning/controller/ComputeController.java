package spring.cloud.config.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.config.learning.service.hystrix.ComputeService;
import spring.cloud.config.learning.service.hystrix.impl.ComputeServiceUtil;

@RestController
public class ComputeController {

    @Autowired
    private ComputeServiceUtil computeService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return computeService.addService();
    }
}
