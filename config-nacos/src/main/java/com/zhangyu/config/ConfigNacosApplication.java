package com.zhangyu.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class ConfigNacosApplication {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = SpringApplication.run(ConfigNacosApplication.class, args);
        while (true) {
            String name = context.getEnvironment().getProperty("user.name");
            String age = context.getEnvironment().getProperty("user.age");
            System.out.println(name + "----" + age);
            TimeUnit.SECONDS.sleep(2);
        }
    }
}
