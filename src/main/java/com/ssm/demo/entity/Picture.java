package com.ssm.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: ssm-demo
 * @description:
 * @author: Leiah1998
 * @create: 2019-08-18 13:40
 **/
public class Picture implements Serializable {
    private Integer id;
    private String path;
    private String remark;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
