package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: cgm
 * @Date: 2020/5/8 11:00
 */
@Slf4j
@RestController
@RequestMapping("/nacos")
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping("/order/get/{id}")
    public String getPaymentById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(serverURL + "/nacos/payment/get/" + id, String.class);
    }

}

