package com.buy.test;

import com.buy.dao.product.IProductDao;
import com.buy.dao.product.ProductImpl;
import com.buy.entity.EasybuyProduct;
import com.buy.utils.ProductParams;
import org.junit.Test;

import java.sql.SQLException;

public class TestProduct {

    @Test
    public void aa(){
        IProductDao productDao=new ProductImpl();
        ProductParams params=new ProductParams();
       /* params.setStartIndex(0);
        params.setPageSize(5);*/
       params.setSort("name");
        System.out.println(productDao.queryProductList(params).size());
    }

    @Test
    public void nn(){
        IProductDao productDao=new ProductImpl();
        ProductParams params=new ProductParams();
       /* params.setStartIndex(0);
        params.setPageSize(5);*/
        params.setSort("name");
        System.out.println(productDao.queryProductCount(params));
    }
    @Test
    public void ss(){
        IProductDao productDao=new ProductImpl();
        try {
            EasybuyProduct easybuyProduct=productDao.findProductById("733");
            System.out.println(easybuyProduct.getName());
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
