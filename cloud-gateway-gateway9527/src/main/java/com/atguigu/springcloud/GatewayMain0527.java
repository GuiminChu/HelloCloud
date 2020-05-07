package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description: 启动类
 * @Author: cgm
 * @Date: 2020/3/14 11:09
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayMain0527 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayMain0527.class, args);
    }
}
