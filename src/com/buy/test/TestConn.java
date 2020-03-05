package com.buy.test;

import com.buy.service.product.IProductCategoryService;
import com.buy.service.product.ProductCategoryServiceImpl;
import com.buy.utils.DataSourceUtil;
import com.buy.utils.ProductCategoryVo;
import org.junit.Test;

import java.util.List;

public class TestConn {
    public static void main(String[] args) {
         DataSourceUtil.getConn();
    }
    @Test
    public void nn(){
        IProductCategoryService productCategoryService=new ProductCategoryServiceImpl();
        List<ProductCategoryVo> categoryList = productCategoryService.queryAllProductCategory();
        System.out.println(categoryList.size());
    }
}
