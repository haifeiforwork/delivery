package com.snail.controller.order;

import com.snail.dao.order.entity.Order;
import com.snail.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hexw
 * @date 2019/2/13 17:28
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/getOrder")
    public void getOrder() {
        Order order = orderService.getById(1L);
        System.out.println("order:"  + order);
    }


}
