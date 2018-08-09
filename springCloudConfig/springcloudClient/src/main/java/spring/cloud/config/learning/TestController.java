/*
package spring.cloud.config.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Value("${prefixMsgName}")
    private String prefixMsgName;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/sendMsg")
    public String getMessage(String messageContent){
        String content = "["+prefixMsgName+"]"+messageContent;
        System.out.println("短信内容是:"+content);
        jdbcTemplate.execute("INSERT INTO message (content) VALUES ('"+content+"')");
        return messageContent;
    }
}
*/
