package com.buy.test;

import com.buy.dao.news.INewsDao;
import com.buy.dao.news.NewsDaoImpl;
import com.buy.entity.EasybuyNews;
import com.buy.service.news.INewsService;
import com.buy.service.news.NewsServiceImpl;
import org.junit.Test;

import java.util.List;

public class TestNews {
    @Test
    public void aa(){
        INewsService newsDao=new NewsServiceImpl();
        List<EasybuyNews> newsList=newsDao.getAllNewsList();
        System.out.println(newsList.size());
    }
}
