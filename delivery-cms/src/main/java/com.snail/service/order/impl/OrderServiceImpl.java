package com.snail.service.order.impl;

import com.snail.dao.order.OrderDao;
import com.snail.dao.order.entity.Order;
import com.snail.service.order.OrderService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public Order getById(Long id) {
        return orderDao.selectById(id);
    }
}
