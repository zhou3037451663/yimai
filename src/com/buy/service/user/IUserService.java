package com.buy.service.user;

import com.buy.entity.EasybuyUser;

import java.sql.SQLException;

public interface IUserService {
    EasybuyUser getUserByloginName(String loginName) throws SQLException, ClassNotFoundException;
    boolean save(EasybuyUser user);

}
