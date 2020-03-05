package com.buy.utils;

import com.buy.entity.EasybuyProduct;

import java.io.Serializable;

/**
 * @Author: Mr.Zhou
 * @Date 2020/3/4
 * @Explain: 购物车商品分组类
 */
public class ShoppingCartItem implements Serializable {
    //商品对象
    private EasybuyProduct product;
    //商品得数量
    private int quantity;
    //商品得价格
    private Float cost;

    public ShoppingCartItem(EasybuyProduct product, int quantity) {
    }

    public ShoppingCartItem(EasybuyProduct product, int quantity, Float cost) {
        this.product = product;
        this.quantity = quantity;
        this.cost = (float)product.getPrice()*quantity;
    }

    public EasybuyProduct getProduct() {
        return product;
    }

    public void setProduct(EasybuyProduct product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }
}
