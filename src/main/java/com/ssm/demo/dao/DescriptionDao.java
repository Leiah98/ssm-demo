package com.ssm.demo.dao;

import com.ssm.demo.entity.Description;

public interface DescriptionDao {
    /**
     * 获取最新一条描述
     * @return
     */
    Description getLastDescription();
}
