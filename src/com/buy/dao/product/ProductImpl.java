package com.buy.dao.product;

import com.buy.entity.EasybuyProduct;
import com.buy.utils.DataSourceUtil;
import com.buy.utils.EmptyUtils;
import com.buy.utils.ProductParams;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductImpl extends DataSourceUtil implements IProductDao {


    public EasybuyProduct toTableClass(ResultSet rs)  {
        EasybuyProduct product = new EasybuyProduct();
        try {
            product.setId(rs.getInt("id"));
            product.setCategorylevel1id(rs.getInt("categorylevel1id"));
            product.setCategorylevel2id(rs.getInt("categorylevel2id"));
            product.setCategorylevel3id(rs.getInt("categorylevel3id"));
            product.setDescription(rs.getString("description"));
            product.setName(rs.getString("name"));
            product.setPrice(rs.getObject("price"));
            product.setStock(rs.getInt("stock"));
            product.setFilename(rs.getString("filename"));
            product.setIsdelete(rs.getInt("isdelete"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return product;
    }

    @Override
    public List<EasybuyProduct> queryProductList(ProductParams params) {
        List<EasybuyProduct> productList = new ArrayList<EasybuyProduct>();
        ResultSet rs = null;
        try {
            //编写SQL语句
            StringBuffer sql = new StringBuffer();
            sql.append("SELECT * FROM `easybuy_product` where 1=1");

            //判断参数，设置不同的查询条件

            if (EmptyUtils.isNotEmpty(params.getKeyWords())) {//1、模糊查询
                sql.append(" and name like ?");
                rs = this.executeQuery(sql.toString(), "%" + params.getKeyWords() + "%");
            } else if (EmptyUtils.isNotEmpty(params.getCategoryId())) {//2、分类查询
                sql.append(" and (categoryLevel1Id=? OR categoryLevel2Id =? OR categoryLevel3Id=?)");
                rs = this.executeQuery(sql.toString(), params.getCategoryId(), params.getCategoryId(), params.getCategoryId());
            } else if (EmptyUtils.isNotEmpty(params.getSort())) {//3、排序
                sql.append(" order by ?");
                rs = this.executeQuery(sql.toString(), params.getSort());
            } else if (EmptyUtils.isNotEmpty(params.isPage())) {//4、分页
                sql.append(" limit ?,?");
                rs = this.executeQuery(sql.toString(), params.getStartIndex(), params.getPageSize());
            }
            //处理结果集
            while (rs.next()) {
                //product对象
                EasybuyProduct product = this.toTableClass(rs);
                productList.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
            productList = null;
        }

        return productList;
    }

    @Override
    public int queryProductCount(ProductParams params) {
        Integer num = 0;
        ResultSet rs = null;
        try {
            //编写SQL语句
            StringBuffer sql = new StringBuffer();
            sql.append("SELECT count(1) FROM `easybuy_product` where 1=1");
            //判断参数，设置不同的查询条件

            if (EmptyUtils.isNotEmpty(params.getKeyWords())) {//1、模糊查询
                sql.append(" and name like ?");
                rs = this.executeQuery(sql.toString(), "%" + params.getKeyWords() + "%");
            } else if (EmptyUtils.isNotEmpty(params.getCategoryId())) {//2、分类查询
                sql.append(" and (categoryLevel1Id=? OR categoryLevel2Id =? OR categoryLevel3Id=?)");
                rs = this.executeQuery(sql.toString(), params.getCategoryId(), params.getCategoryId(), params.getCategoryId());
            } else if (EmptyUtils.isNotEmpty(params.getSort())) {//3、排序
                sql.append(" order by ?");
                rs = this.executeQuery(sql.toString(), params.getSort());
            } else if (EmptyUtils.isNotEmpty(params.isPage())) {//4、分页
                sql.append(" limit ?,?");
                rs = this.executeQuery(sql.toString(), params.getStartIndex(), params.getPageSize());
            }
            //处理结果集
            if (rs.next()) {
                num = rs.getInt(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
            num = -1;
        }
        return num;
    }

    @Override
    //todo
    public EasybuyProduct findProductById(String id){
        String sql="SELECT * FROM easybuy_product WHERE id=?";
        Object[] param={id};
        ResultSet rs;
        EasybuyProduct easybuyProduct=null;
        try {
            rs=this.executeQuery(sql,param);
            while (rs.next()){
                easybuyProduct=toTableClass(rs);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return easybuyProduct;
    }
}
