package com.buy.web;

import com.buy.entity.EasybuyUser;
import com.buy.service.user.IUserService;
import com.buy.service.user.UserServiceImpl;
import com.buy.utils.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "RegisterServlet", urlPatterns = {"/register"})
public class RegisterServlet extends AbstractServlet {
    //依赖于service层
    private IUserService userService;

    @Override
    public void init() throws ServletException {
        userService = new UserServiceImpl();
    }

    public String toRegister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return "/front/register";
    }

    public ReturnResult doRegister(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException {
        ReturnResult result = new ReturnResult();
        try {
            EasybuyUser user = new EasybuyUser();
            String loginName = request.getParameter("loginName");
            String sex = request.getParameter("sex");
            EasybuyUser oldUser = userService.getUserByloginName(loginName);
            //判断用户
            if (EmptyUtils.isNotEmpty(oldUser)) {
                result.returnFail("用户已经存在");
                return result;
            }
            user.setLoginname(request.getParameter("loginName"));
            user.setUsername(request.getParameter("userName"));
            user.setSex(EmptyUtils.isEmpty(sex) ? 1 : 0);
            user.setPassword(SecurityUtils.md5Hex(request.getParameter("password")));
            user.setIdentitycode(request.getParameter("identityCode"));
            user.setEmail(request.getParameter("email"));
            user.setMobile(request.getParameter("mobile"));
            user.setType(Constants.UserType.PRE);
            result=checkUser(user);
            System.out.println(result.getStatus());
            //是否验证通过
            if(result.getStatus()==Constants.ReturnResult.SUCCESS){
                if(!userService.save(user)){
                    return result.returnFail("注册失败！");
                }
            }else{
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        result.returnSuccess("注册成功");
        System.out.println("成功");
        return result;
    }

    /**
     * 后端校验用户信息
     * @param user
     * @return
     */
    public ReturnResult checkUser(EasybuyUser user){
        ReturnResult result = new ReturnResult();
        //正则表达式校验
        if (EmptyUtils.isNotEmpty(user.getMobile())) {
            if (!RegUtils.checkMobile(user.getMobile())){
                result.returnFail("手机格式不正确");
                return result;
            }
        }
        if (EmptyUtils.isNotEmpty(user.getIdentitycode())) {
            if (!RegUtils.checkIdentityCodeReg(user.getIdentitycode())){
                result.returnFail("身份证格式不正确");
                return result;
            }
        }
        if (EmptyUtils.isNotEmpty(user.getEmail())) {
            if (!RegUtils.checkEmail(user.getEmail())){
                result.returnFail("邮箱格式不正确");
                return result;
            }
        }
        return result.returnSuccess();
    }
    @Override
    public Class getServletClass() {
        return RegisterServlet.class;
    }
}
