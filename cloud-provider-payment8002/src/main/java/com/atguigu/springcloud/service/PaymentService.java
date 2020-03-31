package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @Description:
 * @Author: cgm
 * @Date: 2020/3/14 12:32
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
