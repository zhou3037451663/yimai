package com.buy.entity;

import java.io.Serializable;

/**
 * (EasybuyOrderDetail)实体类
 *
 * @author makejava
 * @since 2020-02-18 12:08:44
 */
public class EasybuyOrderDetail implements Serializable {
    private static final long serialVersionUID = 210645893180492843L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 订单主键
    */
    private Integer orderid;
    /**
    * 商品主键
    */
    private Integer productid;
    /**
    * 数量
    */
    private Integer quantity;
    /**
    * 消费
    */
    private Object cost;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Object getCost() {
        return cost;
    }

    public void setCost(Object cost) {
        this.cost = cost;
    }

}