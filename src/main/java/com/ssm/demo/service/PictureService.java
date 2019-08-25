package com.ssm.demo.service;

import com.ssm.demo.entity.Picture;
import com.ssm.demo.utiles.PageResult;
import com.ssm.demo.utiles.PageUtil;

/**
 * @program: ssm-demo
 * @description:
 * @author: Leiah1998
 * @create: 2019-08-18
 **/
public interface PictureService {
    /**
     * 查询列表数据
     * @param pageUtil
     * @return
     */
    PageResult getPicturePage(PageUtil pageUtil);

    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    Picture queryObject(Integer id);

    /**
     * 新增图片
     * @param picture
     * @return
     */
    int save(Picture picture);

    /**
     * 修改
     * @param picture
     * @return
     */
    int update(Picture picture);

    /**
     * 删除
     * @param id
     * @return
     */
    int delete(Integer id);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int deleteBatch(Integer[] ids);
}
