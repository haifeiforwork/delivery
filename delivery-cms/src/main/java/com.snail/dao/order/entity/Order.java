package com.snail.dao.order.entity;


import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

public class Order implements Serializable {

    private Integer id;

    private BigDecimal price;

    private String userName;

    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
