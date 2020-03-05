package com.buy.test;

import com.buy.dao.user.IUser;
import com.buy.dao.user.EasybuyUserImpl;
import com.buy.entity.EasybuyUser;
import com.buy.utils.SecurityUtils;
import org.junit.Test;

import java.sql.SQLException;

public class TestUser {
    @Test
    public void aa() throws SQLException, ClassNotFoundException {
        IUser userDao=new EasybuyUserImpl();
        EasybuyUser user=new EasybuyUser();
        user.setUsername("测试");
        user.setType(0);
        user.setPassword(SecurityUtils.md5Hex("123456"));
        user.setLoginname("guess");
        user.setSex(0);
        user.setMobile("12345678901");
        user.setIdentitycode("123456789012345678");
        user.setEmail("ds@qq.com");
        int a=userDao.save(user);
        if (a>0) {
            System.out.println("有");
        }
    }
}
