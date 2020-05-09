package com.atguigu.springcloud.feign;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: cgm
 * @Date: 2020/5/9 09:51
 */
@Component
public class PaymentFallbackService implements PaymentFeignService {
    @Override
    public String getPaymentOk(Long id) {
        return "payment fallback service";
    }

    @Override
    public String getPaymentTimeout(Long id) {
        return "payment fallback service";
    }
}
