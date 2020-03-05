package com.buy.service.user;

import com.buy.dao.user.IUser;
import com.buy.dao.user.EasybuyUserImpl;
import com.buy.entity.EasybuyUser;

import java.sql.SQLException;

public class UserServiceImpl implements IUserService{
    private IUser userDao=new EasybuyUserImpl();
    @Override
    public EasybuyUser getUserByloginName(String loginName) throws SQLException, ClassNotFoundException {
        return userDao.getUserByloginName(loginName);
    }

    @Override
    public boolean save(EasybuyUser user) {
        return userDao.save(user)>0?true:false;
    }
}
