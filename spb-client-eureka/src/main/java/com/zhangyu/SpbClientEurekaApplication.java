package com.zhangyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * main
 */
@SpringBootApplication
@EnableEurekaClient
public class SpbClientEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpbClientEurekaApplication.class, args);
    }
}
