package com.buy.dao.product;

import com.buy.entity.EasybuyProductCategory;
import com.buy.utils.DataSourceUtil;
import com.buy.utils.ProductCategoryVo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: laoyu
 * @Date: 2020/2/19 10:00
 * @Description:
 */
public class ProductCategoryImpl implements IProductCategory {

    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    /**
     * 根据parentId查询出所有的分类信息
     * @param parentId
     * @return
     */
    @Override
    public List<EasybuyProductCategory> queryAllProductCategory(String parentId) {
        List<EasybuyProductCategory> productCategories = new ArrayList<EasybuyProductCategory>();
        EasybuyProductCategory productCategory = null;

        try {
            StringBuffer sql = new StringBuffer();
            sql.append("select * from easybuy_product_category where 1=1");

            //判断parentID的值，如果为0，显示的是一级分类
            if (!"".equals(parentId) && null != parentId) {
                sql.append(" and parentId = ?");
            }

            //获取连接
            conn = DataSourceUtil.getConn();
            pstmt = conn.prepareStatement(sql.toString());
            if (!"".equals(parentId) && null != parentId) {
                pstmt.setObject(1, parentId);
            }

            rs = pstmt.executeQuery();

            //处理结果集
            while (rs.next()) {
                //实例化对象
                productCategory = new EasybuyProductCategory();
                productCategory.setId(rs.getInt(1));
                productCategory.setName(rs.getString(2));
                productCategory.setParentid(rs.getInt(3));
                productCategory.setType(rs.getInt(4));
                productCategory.setIconclass(rs.getString(5));
                //将对象填充到集合中
                productCategories.add(productCategory);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DataSourceUtil.closeConnection(this.conn);
        }

        return productCategories;
    }

    /**
     * 查询出所有的分类信息
     * @return
     */
    @Override
    public List<ProductCategoryVo> queryAllProductCategory() {
        //查询一级分类的列表
        List<ProductCategoryVo> pc1VoList = new ArrayList<ProductCategoryVo>();
        //查询一级分类
        List<EasybuyProductCategory> pcList = queryAllProductCategory("0");
        //查询二级分类
        for (EasybuyProductCategory productCategory1 : pcList) {
            ProductCategoryVo pc1Vo = new ProductCategoryVo();
            pc1Vo.setProductCategory(productCategory1);
            //查询二级分类的VO
            List<ProductCategoryVo> pc2VoList = new ArrayList<ProductCategoryVo>();
            //查询二级分类
            List<EasybuyProductCategory> pc2List
                    = queryAllProductCategory(productCategory1.getId().toString());
            for (EasybuyProductCategory productCategory2 : pc2List) {
                ProductCategoryVo pc2Vo = new ProductCategoryVo();
                pc2Vo.setProductCategory(productCategory2);
                //查询三级分类的VO
                List<ProductCategoryVo> pc3VoList = new ArrayList<ProductCategoryVo>();
                //查询三级分类
                List<EasybuyProductCategory> pc3List
                        = queryAllProductCategory(productCategory2.getId().toString());
                for (EasybuyProductCategory productCategory3 : pc3List) {
                    ProductCategoryVo pc3Vo = new ProductCategoryVo();
                    pc3Vo.setProductCategory(productCategory3);
                    //
                    pc3VoList.add(pc3Vo);
                }
                pc2Vo.setProductCategoryVoList(pc3VoList);
                pc2VoList.add(pc2Vo);
            }
            pc1Vo.setProductCategoryVoList(pc2VoList);
            pc1VoList.add(pc1Vo);
        }
        return pc1VoList ;
    }
}
