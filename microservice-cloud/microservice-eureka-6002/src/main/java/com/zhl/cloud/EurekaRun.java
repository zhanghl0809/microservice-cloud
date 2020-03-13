package com.zhl.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * microservice-eureka-6002
 */
@EnableEurekaServer //标识一个Eureka Server服务注册中心
@SpringBootApplication
public class EurekaRun {
    public static void main(String[] args) {
        SpringApplication.run(EurekaRun.class, args);
    }
}