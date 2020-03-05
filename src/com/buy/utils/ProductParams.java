package com.buy.utils;

import com.buy.entity.EasybuyProduct;

/**
 * 封装的查询条件
 */
public class ProductParams extends EasybuyProduct {
    //搜索条件
    private String keyWords;
    //排序的列
    private String sort;
    //所属的分类的id
    private Integer categoryId;
    //是否需要分页
    private boolean isPage;
    //从第几条开始显示
    private int startIndex;
    //每页显示多少条
    private int pageSize;

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public boolean isPage() {
        return isPage;
    }

    public void setPage(boolean page) {
        isPage = page;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    //分页的方法
    public void openPage(Integer startIndex,int pageSize){
        isPage=true;
        this.pageSize=pageSize;
        this.startIndex=startIndex;
    }
}
