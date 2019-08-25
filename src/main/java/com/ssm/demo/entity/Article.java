package com.ssm.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: ssm-demo
 * @description: 富文本实体类
 * @author: Leiah1998
 * @create: 2019-08-23
 **/
public class Article implements Serializable {
    //主键
    private Integer id;
    //文章标题
    private String articleTitle;
    //文章内容
    private String articleContent;
    //添加人
    private String addName;
    //添加时间
    private Date createTime;
    //最近更新时间
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getAddName() {
        return addName;
    }

    public void setAddName(String addName) {
        this.addName = addName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
