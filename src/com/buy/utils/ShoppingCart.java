package com.buy.utils;

import com.buy.entity.EasybuyProduct;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: Mr.Zhou
 * @Date 2020/3/4
 * @Explain: 购物车类
 */
public class ShoppingCart implements Serializable {
    //商品列表
    private List<ShoppingCartItem> items;
    //商品总价
    private double sum;

    public List<ShoppingCartItem> getItems() {
        return items;
    }

    public void setItems(List<ShoppingCartItem> items) {
        this.items = items;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    /**
     * 将商品添加到购物车
     *
     * @param product  商品
     * @param quantity 数量
     * @return
     */
    public ReturnResult addItem(EasybuyProduct product, int quantity) {
        ReturnResult result = new ReturnResult();
        boolean flag = false;
        //判断购物车的商品是否已存在
        for (int i = 0; i < items.size(); i++) {
            //如果添加得商品已经在购物车中存在
            if (items.get(i).getProduct().getId().equals(product.getId())) {
                //判断库存是否充足
                if (items.get(i).getQuantity() + quantity > product.getStock()) {
                    return result.returnFail("商品库存不足");
                } else {
                    items.get(i).setQuantity(items.get(i).getQuantity() + quantity);
                    flag = true;
                }
            }
        }
        //如果商品时首次添加到购物车
        if (!flag) {
            items.add(new ShoppingCartItem(product,quantity));
        }
        return result.returnSuccess();
    }
    public void removeItem(int index){
        items.remove(index);
    }
    public void modifyQuantity(int index,int quantity){
items.get(index).setQuantity(quantity);
    }
}
