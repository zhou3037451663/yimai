package com.buy.service.product;

import com.buy.dao.product.IProductCategory;
import com.buy.dao.product.ProductCategoryImpl;
import com.buy.entity.EasybuyProductCategory;
import com.buy.utils.ProductCategoryVo;

import java.util.List;

public class ProductCategoryServiceImpl implements IProductCategoryService {
    private IProductCategory productCategory=new ProductCategoryImpl();
    @Override
    public List<EasybuyProductCategory> queryAllProductCategory(String parentId) {
        parentId="0";
        return productCategory.queryAllProductCategory(parentId);
    }

    @Override
    public List<ProductCategoryVo> queryAllProductCategory() {
        return productCategory.queryAllProductCategory();
    }
}
