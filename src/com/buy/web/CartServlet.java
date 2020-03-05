package com.buy.web;

import com.buy.entity.EasybuyProduct;
import com.buy.service.product.IProductService;
import com.buy.service.product.ProductServiceImpl;
import com.buy.utils.Constants;
import com.buy.utils.EmptyUtils;
import com.buy.utils.ReturnResult;
import com.buy.utils.ShoppingCart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @Author: Mr.Zhou
 * @Date 2020/3/4
 * @Explain:
 */
@WebServlet(name = "CartServlet", urlPatterns = "/cart")
public class CartServlet extends AbstractServlet {
    IProductService productService;

    @Override
    public Class getServletClass() {
        return CartServlet.class;
    }

    @Override
    public void init() throws ServletException {
        productService = new ProductServiceImpl();
    }

    protected ReturnResult add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, ClassNotFoundException {
        ReturnResult result = new ReturnResult();
        //添加购物车需要得参数
        String id = request.getParameter("entityId");
        String quantityStr = request.getParameter("quantity");
        int quantity = 1;
        if (EmptyUtils.isNotEmpty(quantityStr)) {
            quantity = Integer.valueOf(quantityStr);
        }
        //查询商品得对应信息
        //todo
        EasybuyProduct product = productService.findProductById(id);
        if (product.getStock() < quantity) {
            return result.returnFail("商品数量不足");
        }
        //如果商品对的数量充足，则获取购物车信息
        ShoppingCart car = getCartFromSession(request);
        //向购物车添加商品
        result = car.addItem(product, quantity);
        if (result.getStatus() == Constants.ReturnResult.SUCCESS) {
            car.setSum(EmptyUtils.isEmpty(car.getSum()) ? 0.0 : car.getSum() + ((float) product.getPrice() * quantity * 1.0));
        }
        return result;
    }

    /**
     * 获取购物车
     *
     * @param request
     * @return
     */
    private ShoppingCart getCartFromSession(HttpServletRequest request) {
        HttpSession session = request.getSession();
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        //
        if (EmptyUtils.isEmpty(cart)) {
            cart = new ShoppingCart();
            session.setAttribute("cart", cart);
        }
        return cart;
    }
}
