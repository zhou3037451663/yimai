package com.buy.service.product;

import com.buy.entity.EasybuyProduct;
import com.buy.utils.ProductParams;

import java.sql.SQLException;
import java.util.List;

/**
 * 商品信息结构
 */
public interface IProductService {
    /**
     * 根据条件查询商品列表
     *
     * @param params
     * @return
     */
    List<EasybuyProduct> queryProductList(ProductParams params);

    /**
     * 根据条件查询商品的数量
     *
     * @param params
     * @return
     */
    int queryProductCount(ProductParams params);

    /**
     * 根据商品id查询指定商品信息
     *
     * @param id
     * @return
     */
    public EasybuyProduct findProductById(String id) throws SQLException, ClassNotFoundException;
}
