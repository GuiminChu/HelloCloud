package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: cgm
 * @Date: 2020/3/14 12:33
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public String getPaymentOk(Long id) {
        return "线程池：" + Thread.currentThread().getName() + " OK " + id;
    }

    @Override
    public String getPaymentTimeout(Long id) {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "线程池：" + Thread.currentThread().getName() + " Timeout " + id;
    }
}
