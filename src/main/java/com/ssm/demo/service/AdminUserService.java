package com.ssm.demo.service;

import com.ssm.demo.entity.AdminUser;
import com.ssm.demo.utiles.PageResult;
import com.ssm.demo.utiles.PageUtil;

import java.io.File;
import java.util.List;

/**
 * @program: ssm-demo
 * @description:
 * @author: Leiah1998
 * @create: 2019-08-06 16:04
 **/
public interface AdminUserService {

    PageResult getAdminUserPage(PageUtil pageUtil);

    /**
     * 登录功能
     * @param userName
     * @param password
     * @return
     */
    AdminUser updateTokenAndLogin(String userName, String password);

    /**
     * 根据userToken获取用户记录
     * @param userToken
     * @return
     */
    AdminUser getAdminUserByToken(String userToken);

    /**
     * 根据id获取用户记录
     * @param id
     * @return
     */
    AdminUser selectById(Long id);

    /**
     * 根据用户名获取用户记录
     * @param userName
     * @return
     */
    AdminUser selectByUserName(String userName);

    /**
     * 新增用户记录
     * @param user
     * @return
     */
    int save(AdminUser user);

    /**
     * 根据excel导入用户记录
     * @param file
     * @return
     */
    int importUserByExcelFile(File file);

    /**
     * 修改密码
     * @param user
     * @return
     */
    int updatePassword(AdminUser user);

    /**
     * 批量删除功能
     * @param ids
     * @return
     */
    int deleteBatch(Integer[] ids);

    /**
     * 获取导出数据
     * @return
     */
    List<AdminUser> getUsersForExport();
}
