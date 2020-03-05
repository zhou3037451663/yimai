package com.buy.service.product;

import com.buy.dao.product.IProductDao;
import com.buy.dao.product.ProductImpl;
import com.buy.entity.EasybuyProduct;
import com.buy.utils.DataSourceUtil;
import com.buy.utils.EmptyUtils;
import com.buy.utils.ProductParams;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl extends DataSourceUtil implements IProductService {
    private IProductDao productDao=new ProductImpl();

    @Override
    public List<EasybuyProduct> queryProductList(ProductParams params) {
        return productDao.queryProductList(params);
    }

    @Override
    public int queryProductCount(ProductParams params) {
        return productDao.queryProductCount(params);
    }

    @Override
    //todo
    public EasybuyProduct findProductById(String id) throws SQLException, ClassNotFoundException {
        return productDao.findProductById(id);
    }
}
