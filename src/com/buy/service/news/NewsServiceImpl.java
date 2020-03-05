package com.buy.service.news;

import com.buy.dao.news.INewsDao;
import com.buy.dao.news.NewsDaoImpl;
import com.buy.entity.EasybuyNews;

import java.util.List;

public class NewsServiceImpl implements INewsService{
    INewsDao newsDao=new NewsDaoImpl();
    @Override
    public List<EasybuyNews> getAllNewsList() {
        return newsDao.getAllNewsList();
    }
}
