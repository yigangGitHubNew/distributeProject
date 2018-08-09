package spring.cloud.config.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudServerApplication {

    public static void main(String[] args) {
       new SpringApplicationBuilder(SpringCloudServerApplication.class).web(true).profiles("native").run(args);
    }
}
