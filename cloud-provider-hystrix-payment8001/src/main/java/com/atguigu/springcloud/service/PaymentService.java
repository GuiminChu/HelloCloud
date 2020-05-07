package com.atguigu.springcloud.service;

/**
 * @Description:
 * @Author: cgm
 * @Date: 2020/3/14 12:32
 */
public interface PaymentService {
    String getPaymentOk(Long id);

    String getPaymentTimeout(Long id);
}
