package spring.cloud.config.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sendMsg")
@RefreshScope
public class SendMsgController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/msgContent")
    public String sendMsg(String content){
        System.out.println("短信的内容："+content);
        jdbcTemplate.execute("INSERT INTO messeage (content) VALUES ('"+content+"')");
        return content;
    }
}
