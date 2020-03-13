package com.zhl.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProductProviderRun {
    public static void main(String[] args) {
        SpringApplication.run(ProductProviderRun.class, args);
    }
}

