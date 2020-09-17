package com.lqbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class eureka_server_8761 {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(eureka_server_8761.class);
        application.run(args);
    }
}
