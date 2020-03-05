package com.buy.dao.user;

import com.buy.entity.EasybuyUser;

import java.sql.SQLException;

public interface IUser {

    EasybuyUser getUserByloginName(String loginName) throws SQLException, ClassNotFoundException;

    int save(EasybuyUser user);

}
