package com.buy.test;

import com.buy.dao.product.IProductCategory;
import com.buy.dao.product.ProductCategoryImpl;
import com.buy.entity.EasybuyProductCategory;
import com.buy.service.product.IProductCategoryService;
import com.buy.service.product.ProductCategoryServiceImpl;
import org.junit.Test;

import java.util.List;

public class TestProductCategory {
    @Test
    public void testProduct(){
        IProductCategoryService productCategory=new ProductCategoryServiceImpl();
        List<EasybuyProductCategory> productCategories=productCategory.queryAllProductCategory("0");
        for (EasybuyProductCategory category : productCategories) {
            System.out.println(category.getName());
        }
    }
}
