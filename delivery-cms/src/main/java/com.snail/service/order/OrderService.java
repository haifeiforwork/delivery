package com.snail.service.order;

import com.snail.dao.order.entity.Order;

public interface OrderService {

    Order getById(Long id);
}
