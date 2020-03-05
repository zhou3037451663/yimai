package com.buy.entity;

import java.io.Serializable;

/**
 * (EasybuyUser)实体类
 *
 * @author makejava
 * @since 2020-02-18 12:08:44
 */
public class EasybuyUser implements Serializable {
    private static final long serialVersionUID = 274592071986807862L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 登录名
    */
    private String loginname;
    /**
    * 用户名
    */
    private String username;
    /**
    * 密码
    */
    private String password;
    /**
    * 性别(1:男 0：女)
    */
    private Integer sex;
    /**
    * 身份证号
    */
    private String identitycode;
    /**
    * 邮箱
    */
    private String email;
    /**
    * 手机
    */
    private String mobile;
    /**
    * 类型（1：后台 0:前台）
    */
    private Integer type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getIdentitycode() {
        return identitycode;
    }

    public void setIdentitycode(String identitycode) {
        this.identitycode = identitycode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}