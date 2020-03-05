package com.buy.web;

import com.buy.entity.EasybuyNews;
import com.buy.entity.EasybuyProductCategory;
import com.buy.service.news.INewsService;
import com.buy.service.news.NewsServiceImpl;
import com.buy.service.product.IProductCategoryService;
import com.buy.service.product.ProductCategoryServiceImpl;
import com.buy.utils.ProductCategoryVo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeServlet",urlPatterns = {"/home"})
public class HomeServlet extends AbstractServlet {
    /*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        //从service层获取数据
        IProductCategoryService productCategoryService=new ProductCategoryServiceImpl();
        List<EasybuyProductCategory> categoryList = productCategoryService.queryAllProductCategory("0");
        //存储数据
        request.setAttribute("categoryList",categoryList);
        //携带数据跳转到home.jsp传递数据
        request.getRequestDispatcher("/front/home.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        doPost(request,response);
    }*/
    IProductCategoryService productCategoryService;
    INewsService newsService;
    @Override
    public void init() throws ServletException{
        //从service层获取数据
        productCategoryService=new ProductCategoryServiceImpl();
        newsService=new NewsServiceImpl();
    }

    public String index(HttpServletRequest request, HttpServletResponse response) throws Exception{

        List<ProductCategoryVo> categoryList =productCategoryService.queryAllProductCategory();
//        System.out.println(categoryList.size());
        List<EasybuyNews> newsList=newsService.getAllNewsList();
        //存储数据
        request.getSession().setAttribute("categoryList",categoryList);
        request.getSession().setAttribute("newsList",newsList);
        //页面跳转
        return "/front/home";
    }

    @Override
    public Class getServletClass() {
        return HomeServlet.class;
    }
}
