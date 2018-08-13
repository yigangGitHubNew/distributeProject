package spring.cloud.config.learning;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class SpringCloudServerApplication {

    public static void main(String[] args) {
       new SpringApplicationBuilder(SpringCloudServerApplication.class).web(true).profiles("native").run(args);
    }
}
