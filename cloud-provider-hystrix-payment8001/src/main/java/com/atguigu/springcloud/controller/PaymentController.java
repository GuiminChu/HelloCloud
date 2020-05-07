package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: cgm
 * @Date: 2020/3/14 12:36
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/hystrix/ok/{id}")
    public String getPaymentOk(@PathVariable("id") Long id) {
        String result = paymentService.getPaymentOk(id);
        return result;
    }

    @GetMapping("/hystrix/timeout/{id}")
    public String getPaymentTimeout(@PathVariable("id") Long id) {
        return paymentService.getPaymentTimeout(id);
    }

}
