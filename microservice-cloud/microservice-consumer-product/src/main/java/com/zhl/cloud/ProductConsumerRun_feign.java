package com.zhl.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

// 会扫描指定包下面使用@FeignClient标识的接口
@EnableFeignClients(basePackages ="com.zhl.cloud.service")
@EnableEurekaClient
@SpringBootApplication
public class ProductConsumerRun_feign {

    public static void main(String[] args) {
        SpringApplication.run(ProductConsumerRun_feign.class, args);
    }
}
