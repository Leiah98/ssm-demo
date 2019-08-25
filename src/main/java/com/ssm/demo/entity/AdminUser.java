package com.ssm.demo.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * @program: ssm-demo
 * @description: 用户表的映射
 * @author: Leiah1998
 * @create: 2019-08-06 15:27
 **/
public class AdminUser implements Serializable {
    private Long id;
    private String userName;
    private String password;
    private String userToken;
    private int isDeleted;
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
