package spring.cloud.config.learning;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringCloudServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudServiceApplication.class).web(true).run(args);
    }
}
