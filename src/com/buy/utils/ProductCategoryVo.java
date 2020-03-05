package com.buy.utils;

import com.buy.entity.EasybuyProduct;
import com.buy.entity.EasybuyProductCategory;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: laoyu
 * @Date: 2020/2/27 17:20
 * @Description: 商品+分类
 */
public class ProductCategoryVo {
    //商品分类
    private EasybuyProductCategory productCategory;
    //商品
    private EasybuyProduct product;
    //vo
    private List<ProductCategoryVo> productCategoryVoList
            =new ArrayList<ProductCategoryVo>();

    public EasybuyProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(EasybuyProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public EasybuyProduct getProduct() {
        return product;
    }

    public void setProduct(EasybuyProduct product) {
        this.product = product;
    }

    public List<ProductCategoryVo> getProductCategoryVoList() {
        return productCategoryVoList;
    }

    public void setProductCategoryVoList(List<ProductCategoryVo> productCategoryVoList) {
        this.productCategoryVoList = productCategoryVoList;
    }
}
