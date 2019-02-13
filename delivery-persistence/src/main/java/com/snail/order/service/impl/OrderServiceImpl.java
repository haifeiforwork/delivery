package com.snail.order.service.impl;

import com.snail.order.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author hexw
 * @date 2019/2/13 16:11
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public void getOrder(String id) {
        System.out.println("print order id:" + id);
    }
}
