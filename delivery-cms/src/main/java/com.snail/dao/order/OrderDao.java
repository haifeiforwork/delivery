package com.snail.dao.order;

import com.snail.dao.order.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
public interface OrderDao  {

    Order selectById(@Param("id") Long id);

}
