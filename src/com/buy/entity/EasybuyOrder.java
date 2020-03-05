package com.buy.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (EasybuyOrder)实体类
 *
 * @author makejava
 * @since 2020-02-18 12:08:44
 */
public class EasybuyOrder implements Serializable {
    private static final long serialVersionUID = -97401819762999626L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 用户主键
    */
    private Integer userid;
    
    private String loginname;
    /**
    * 用户地址
    */
    private String useraddress;
    /**
    * 创建时间
    */
    private Date createtime;
    /**
    * 总消费
    */
    private Object cost;
    /**
    * 订单号
    */
    private String serialnumber;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Object getCost() {
        return cost;
    }

    public void setCost(Object cost) {
        this.cost = cost;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

}