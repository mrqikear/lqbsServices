package com.lqbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class websoket_7010 {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(websoket_7010.class);
        application.run(args);
    }
}
